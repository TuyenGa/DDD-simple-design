package com.example.demo.domain.repository.account;

import com.example.demo.domain.entity.account.Account;
import com.example.demo.domain.vo.AccountId;
import com.example.demo.domain.vo.UserId;

public interface AccountDomainRepository {
    Account create(Account account) throws Exception;

    Account update(Account account) throws Exception;

    Account findById(AccountId accountId) throws Exception;

    Account findByUserId(UserId userId) throws Exception;
}
