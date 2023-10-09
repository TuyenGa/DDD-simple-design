package com.example.demo.domain.vo;

import com.example.demo.infrastructure.exception.MoneyAmountNotNullException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
public class Money {
    private BigDecimal amount;

    private Currency currency;

    public Money(BigDecimal amount, Currency currency) {

        if (amount == null){
            throw new MoneyAmountNotNullException("Số tiền không được nhỏ hơn 0");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public int compareTo(Money money) {
        return this.amount.compareTo(money.getAmount());
    }

    public Money subtract(Money money) throws Exception {
        BigDecimal resultAmout = this.amount.subtract(money.getAmount());
        return new Money(resultAmout, this.currency);
    }


    public Money add(Money money) throws MoneyAmountNotNullException {
        BigDecimal resultAmout = this.amount.add(money.getAmount());
        return new Money(resultAmout, this.currency);
    }
}
