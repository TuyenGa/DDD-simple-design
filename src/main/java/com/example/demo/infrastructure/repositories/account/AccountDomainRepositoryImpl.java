package com.example.demo.infrastructure.repositories.account;

import com.example.demo.domain.entity.account.Account;
import com.example.demo.domain.repository.account.AccountDomainRepository;
import com.example.demo.domain.vo.AccountId;
import com.example.demo.domain.vo.UserId;
import com.example.demo.infrastructure.model.AccountModel;
import com.example.demo.infrastructure.persistence.account.AccountBuilder;
import com.example.demo.infrastructure.persistence.account.impl.AccountPersistenceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountDomainRepositoryImpl implements AccountDomainRepository {

    private final AccountPersistenceImpl accountPersistence;

    private final AccountBuilder accountBuilder;


    @Override
    public Account create(Account account) throws Exception {
        return null;
    }

    @Override
    public Account update(Account account) throws Exception {
        return null;
    }

    @Override
    public Account findById(AccountId accountId) throws Exception {
        return null;
    }

    @Override
    public Account findByUserId(UserId userId) throws Exception {
        return null;
    }
}
