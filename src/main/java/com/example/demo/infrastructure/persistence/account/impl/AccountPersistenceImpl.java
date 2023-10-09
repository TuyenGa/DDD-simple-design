package com.example.demo.infrastructure.persistence.account.impl;


import com.example.demo.domain.vo.UserId;
import com.example.demo.infrastructure.model.AccountModel;
import com.example.demo.infrastructure.persistence.account.AccountPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class AccountPersistenceImpl {

    public AccountModel findByUserId(UserId id) {
        return null;
    }
}
