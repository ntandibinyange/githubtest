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
@Table(name = "profile")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_profile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id", length = 100)
    private long profile_id;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "surname", length = 100)
    private String surname;

    @Column(name = "date_of_birth", length = 100)
    private String date_of_birth;

    @Column(name = "gender", length = 100)
    private String gender;

    @Column(name = "phne_number", length = 100)
    private long phne_number;

    public Mdl_profile(String name, String surname, String date_of_birth, String gender, long phne_number) {
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.phne_number = phne_number;
    }

    @OneToMany(mappedBy = "mdl_profile")
    @JsonIgnoreProperties("mdl_profile")
    private List<Mdl_account> mdl_account_one;
}
