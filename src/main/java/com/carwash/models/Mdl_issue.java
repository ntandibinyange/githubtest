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
@Table(name = "issue")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_issue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issue_id", length = 100)
    private long issue_id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 200)
    private String description;

    public Mdl_issue(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @OneToMany(mappedBy = "mdl_issue")
    @JsonIgnoreProperties("mdl_issue")
    private List<Mdl_cartype> mdl_cartype_one;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Mdl_booking mdl_booking;

}
