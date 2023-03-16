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
@Table(name = "booking")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", length = 100)
    private long booking_id;

    @Column(name = "date", length = 100)
    private String date;
    @Column(name = "account", length = 100)
    private long account;

    @Column(name = "issue", length = 100)
    private long issue;

    @Column(name = "cartype", length = 100)
    private long cartype;
    @Column(name = "issue_desc", length = 200)
    private String issue_desc;

    @Column(name = "issue_found", length = 200)
    private String issue_found;

    @Column(name = "status", length = 100)
    private String status;

    @Column(name = "plateNo", length = 100)
    private String plateNo;

    public Mdl_booking(String date, long account, long cartype, String issue_desc, String issue_found, String status, String plateNo) {
        this.date = date;
        this.account = account;
        this.cartype = cartype;
        this.issue_desc = issue_desc;
        this.issue_found = issue_found;
        this.status = status;
        this.plateNo = plateNo;
    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Mdl_account mdl_account;

    @OneToMany(mappedBy = "mdl_booking")
    @JsonIgnoreProperties("mdl_booking")
    private List<Mdl_calendar> mdl_calender_one;

    @OneToMany(mappedBy = "mdl_booking")
    @JsonIgnoreProperties("mdl_booking")
    private List<Mdl_chechout> mdl_chechout_one;

    @OneToMany(mappedBy = "mdl_booking")
    @JsonIgnoreProperties("mdl_booking")
    private List<Mdl_issue> mdl_issue_one;

}
