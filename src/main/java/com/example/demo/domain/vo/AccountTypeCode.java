package com.example.demo.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum AccountTypeCode {
    OPEN(1), CREATED(2), APPROVED(3);

    private Integer code;
}
