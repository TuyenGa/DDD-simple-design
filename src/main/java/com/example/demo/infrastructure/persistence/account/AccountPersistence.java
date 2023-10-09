package com.example.demo.infrastructure.persistence.account;

import com.example.demo.domain.vo.UserId;
import com.example.demo.infrastructure.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountPersistence extends JpaRepository<AccountModel, Long> {

    AccountModel findByUserId(UserId id);
}
