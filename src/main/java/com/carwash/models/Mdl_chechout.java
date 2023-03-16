/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author SANGWA
 */
@Setter
@Getter
@Entity
@Table(name = "chechout")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_chechout implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chechout_id", length = 100)
    private long chechout_id;

    @Column(name = "date", length = 100)
    private String date;
    @Column(name = "claimed_issue", length = 100)
    private String claimed_issue;

    @Column(name = "issue_found_desc", length = 100)
    private String issue_found_desc;
    
    @Column(name = "issue", length = 100)
    private long issue;
    
    @Column(name = "booking", length = 100)
    private long booking;
    
     @Column(name = "account", length = 100)
    private long account;
     
    @Column(name = "total_cost", length = 100)
    private long total_cost;

    public Mdl_chechout(String date,String claimed_issue, String issue_found_desc,long issue,long total_cost,long booking,long account) {
        this.date = date;
        this.claimed_issue = claimed_issue;
        this.issue_found_desc = issue_found_desc;
        this.issue = issue;
        this.total_cost = total_cost;
        this.booking = booking;
        this.account = account;
    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Mdl_account mdl_account;
    
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Mdl_booking mdl_booking;
    
    
    @ManyToOne
    @JoinColumn(name = "issue_id")
    private Mdl_issue mdl_issue;


}
