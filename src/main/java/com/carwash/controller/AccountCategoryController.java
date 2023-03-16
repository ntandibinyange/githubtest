/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.controller;

import com.carwash.exception.ResourceNotFoundException;
import com.carwash.models.Mdl_account_category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carwash.repository.AccountCategoryRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author SANGWA
 */

@RestController
@RequestMapping("/carwash/api/category")
public class AccountCategoryController {

    @Autowired
    AccountCategoryRepository categoryRepsitory;
    
    @PostMapping()
    public ResponseEntity<Mdl_account_category> addCategory(@RequestBody Mdl_account_category mdl_account_category) {
        return new ResponseEntity<>(categoryRepsitory.save(mdl_account_category), HttpStatus.OK);
    }

    // get all account categorys
    @GetMapping("/account_category")
    public List<Mdl_account_category> getAllCategorys() {
        return categoryRepsitory.findAll();
    }
//aupdate account account categorys

//    @PutMapping("/account_category/{id}")
//    ResponseEntity<Mdl_account_category> updeteCategory(@PathVariable Long id, @RequestBody Mdl_account_category categoryDetails) {
//        Mdl_account_category category = categoryRepsitory.findById(id).orElseThrow(() -> ResourseNotFoundException("Category not exist with id:" + id));
//
//        category.setName(categoryDetails.getName());
//        Mdl_account_category categoryUpdated = categoryRepsitory.save(category);
//        return ResponseEntity.ok(categoryUpdated);
//
//    }

//    // delete account category
//    @DeleteMapping("/account_category/{id}")
//    ResponseEntity<Map<String, boolean>> deleteCategory(@PathVariable Long id) {
//        Mdl_account_category category = categoryRepsitory.findById(id).orElseThrow(() -> ResourceNotFoundException("Category not exist with id:" + id));
//        categoryRepsitory.delete(category);
//        Map<String ,boolean> response = new HashMap<>;
//        response.put("deleted",Boolean.TRUE);
//        return ResponseEntity.ok(response);

    }


   

