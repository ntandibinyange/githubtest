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
@Table(name = "cartype")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_cartype implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartype_id", length = 100)
    private long cartype_id;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "issue", length = 100)
    private String issue;

    public Mdl_cartype(String name, String issue) {
        this.name = name; 
    }

    @ManyToOne
    @JoinColumn(name = "issue_id")
    private Mdl_issue mdl_issue;

    @OneToMany(mappedBy = "mdl_cartype")
    @JsonIgnoreProperties("mdl_cartype")
    private List<Mdl_tarrif> mdl_tarrif_one;

}
