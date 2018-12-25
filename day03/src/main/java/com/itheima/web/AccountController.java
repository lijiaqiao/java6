package com.itheima.web;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService service;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("controller的查询所有方法。。。。");
        List<Account> list = service.findAll();

        model.addAttribute("list",list);

        return "list";
    }


    @RequestMapping("/save")
    public String save(Account account){

        service.save(account);

        return "list";
    }
}
