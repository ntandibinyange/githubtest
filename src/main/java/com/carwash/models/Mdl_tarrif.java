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
@Table(name = "tarrif")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_tarrif implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarrif_id", length = 100)
    private long tarrif_id;

    @Column(name = "price_hour", length = 100)
    private long price_hour;
    @Column(name = "cartype", length = 100)
    private long cartype;

    @Column(name = "account", length = 100)
    private long account;

    public Mdl_tarrif(long price_hour, long cartype, long account) {
        this.price_hour = price_hour;
        this.cartype = cartype;
        this.account = account;

    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Mdl_account mdl_account;

    

    @ManyToOne
    @JoinColumn(name = "cartypeId")
    private Mdl_cartype mdl_cartype;
    
    


}
