package com.example.demo.infrastructure.persistence.account;

import com.example.demo.domain.entity.account.Account;
import com.example.demo.infrastructure.model.AccountModel;

public interface AccountBuilder  {

    Account toAccountEntity(AccountModel accountModel) throws Exception;

    AccountModel toAccountModel(Account account);


}
