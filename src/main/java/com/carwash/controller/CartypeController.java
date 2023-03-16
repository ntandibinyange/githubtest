/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.controller;

import com.carwash.models.Mdl_account_category;
import com.carwash.models.Mdl_cartype;
import com.carwash.repository.AccountCategoryRepository;
import com.carwash.repository.CartypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SANGWA
 */
@RestController
@RequestMapping("/carwash/api/cartype")
public class CartypeController{

    @Autowired
    CartypeRepository cartypeRepsitory;
  
    @PostMapping()
    public ResponseEntity<Mdl_cartype> addCartype(@RequestBody Mdl_cartype cartype) {
        return new ResponseEntity<>(cartypeRepsitory.save(cartype), HttpStatus.OK);
    }
}
