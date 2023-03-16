/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.controller;

import com.carwash.exception.ResourceNotFoundException;
import com.carwash.models.Mdl_account;
import com.carwash.models.Mdl_carwash;
import com.carwash.repository.AccountRepository;
import com.carwash.repository.CarwashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SANGWA
 */
@RestController
@RequestMapping("/carwash/api/carwash")
public class CarwashController {

    @Autowired
    CarwashRepository carwashRepsitory;
    @Autowired
    AccountRepository accountRepository;

    @PostMapping("/{accountId}")
    public ResponseEntity<Mdl_carwash> addCarwash(@PathVariable(name = "accountId") long accountId, @RequestBody Mdl_carwash carwash) {

        Mdl_account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new ResourceNotFoundException("account with id " + accountId + " not found"));
        carwash.setMdl_account(account);
        return new ResponseEntity<>(carwashRepsitory.save(carwash), HttpStatus.OK);
    }

}
