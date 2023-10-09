package com.example.demo.domain.vo;

import lombok.Data;

@Data
public class Currency {
    private String value;

    public Currency(String value) throws IllegalAccessException {
        if (value == null || "".equals(value)) {
            throw new IllegalAccessException("Currency không hợp lệ");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "value='" + value + '\'' +
                '}';
    }
}
