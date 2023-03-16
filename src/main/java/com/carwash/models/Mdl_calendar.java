/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "calender")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_calendar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calender_id", length = 100)
    private long calender_id;

    @Column(name = "from_time", length = 100)
    private String from_time;
    @Column(name = "to_time", length = 100)
    private String to_time;

    @Column(name = "date", length = 100)
    private String date;

    @Column(name = "hour_23", length = 100)
    private long hour_23;
    
    @Column(name = "booking", length = 100)
    private long booking;
    
     @Column(name = "account", length = 100)
    private long account;
    

    public Mdl_calendar(String from_time, String to_time, String date, long hour_23,long booking,long account) {
        this.from_time = from_time;
        this.to_time = to_time;
        this.date = date;
        this.hour_23 = hour_23;
        this.booking = booking;
        this.account = account;
    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Mdl_account mdl_account;
    
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Mdl_booking mdl_booking;
    
    
//    @OneToMany(mappedBy = "mdl_calender")
//    @JsonIgnoreProperties("mdl_calender")
//    private List<Mdl_issue> mdl_issue;
    
}
