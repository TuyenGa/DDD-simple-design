package com.example.demo.domain.entity.account;

import com.example.demo.domain.vo.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Account {
    private AccountId id;
    private AccountTypeCode accountTypeCode;
    private UserId userId;
    private BigDecimal available;
    private BigDecimal dailyLimit;
    private String currency;
}
