package com.example.demo.infrastructure.persistence.account;

import com.example.demo.domain.entity.account.Account;
import com.example.demo.domain.vo.AccountId;
import com.example.demo.domain.vo.AccountTypeCode;
import com.example.demo.domain.vo.UserId;
import com.example.demo.infrastructure.model.AccountModel;
import org.springframework.stereotype.Component;

@Component
public class AccountBuilder  {

    Account toAccountEntity(AccountModel accountModel) {
        Account account = Account.builder()
                .id(new AccountId(accountModel.getId()))
                .accountTypeCode(AccountTypeCode.values()[accountModel.getAccountTypeCode()])
                .available(accountModel.getAvailableAmout())
                .currency(accountModel.getCurrency())
                .dailyLimit(accountModel.getDailyLimitAmout())
                .userId(new UserId(accountModel.getUserId()))
                .build();

        return account;
    }

    AccountModel toAccountModel(Account account) {
        return AccountModel.builder().build();

    }


}
