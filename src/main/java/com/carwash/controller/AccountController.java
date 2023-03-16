/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.controller;

import com.carwash.exception.ResourceNotFoundException;
import com.carwash.models.Mdl_account_category;
import com.carwash.models.Mdl_account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carwash.repository.AccountRepository;
import com.carwash.repository.AccountCategoryRepository;

/**
 *
 * @author SANGWA
 */
@RestController
@RequestMapping("/carwash/api/account")
public class AccountController {

    @Autowired
    AccountRepository accountRepsitory;
    @Autowired
    AccountCategoryRepository accountCategoryRepository;

    @PostMapping("/{accountCategoryId}")
    public ResponseEntity<Mdl_account> addAccount(@PathVariable(name = "accountCategoryId") long accountCategoryId, @RequestBody Mdl_account account) {

        Mdl_account_category accountCategory = accountCategoryRepository.findById(accountCategoryId)
                .orElseThrow(() -> new ResourceNotFoundException("accountCategory with accountCategoryId " + accountCategoryId + " not found"));
        account.setMdl_account_category(accountCategory);
        return new ResponseEntity<>(accountRepsitory.save(account), HttpStatus.OK);

    }
}
