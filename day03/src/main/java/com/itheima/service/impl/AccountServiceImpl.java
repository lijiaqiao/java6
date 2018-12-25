package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao dao;

    @Override
    public List<Account> findAll() {
        System.out.println("service层的findall方法");
        List<Account> list = dao.findAll();
        return list;
    }

    @Override
    public void save(Account account) {
        System.out.println("service层保存方法");
        dao.save(account);
    }
}
