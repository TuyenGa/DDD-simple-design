package com.example.demo.infrastructure.exception;

public class MoneyAmountNotNullException extends IllegalArgumentException{
    public MoneyAmountNotNullException(String message) {
        super(message);
    }
}
