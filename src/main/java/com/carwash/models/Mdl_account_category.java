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
@Table(name = "account_category")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)


public class Mdl_account_category implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_category_id", length = 100)
    private long account_category_id;

    @Column(name = "name", length = 100)
    private String name;
    
    public Mdl_account_category(String name) {
        this.name = name;
    }
    
    @OneToMany(mappedBy = "mdl_account_category")
     @JsonIgnoreProperties("mdl_account_category")
    private List<Mdl_account> mdl_account;
    
    
}
