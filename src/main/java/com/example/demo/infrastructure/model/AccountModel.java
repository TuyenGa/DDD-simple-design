package com.example.demo.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountModel {
    @Id
    private Long id;
    private Integer accountTypeCode;
    private String userId;
    private BigDecimal availableAmout;
    private BigDecimal dailyLimitAmout;
    private String currency;

}
