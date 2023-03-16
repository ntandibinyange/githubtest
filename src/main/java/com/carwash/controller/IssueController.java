/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.controller;

import com.carwash.models.Mdl_issue;
import com.carwash.repository.IssueRepository;
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
 * 
 * 
 */
@RestController
@RequestMapping("/carwash/api/issue")
public class IssueController {
    
    @Autowired
    IssueRepository issueRepository;
  
    @PostMapping()
    public ResponseEntity<Mdl_issue> addIssue(@RequestBody Mdl_issue issue) {
        return new ResponseEntity<>(issueRepository.save(issue), HttpStatus.OK);
    }
    
}
