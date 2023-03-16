/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.models;

/**
 *
 * @author SANGWA
 */
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

@Setter
@Getter
@Entity
@Table(name = "account")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", length = 100)
    private long account_id;

    @Column(name = "username", length = 100)
    private String username;
    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "account_category", length = 100)
    private long account_category;

    @Column(name = "profile", length = 100)
    private long profile;

    public Mdl_account(String username, String password, long account_category, long profile) {
        this.username = username;
        this.password = password;
        this.account_category = account_category;
        this.profile = profile;
    }

    @ManyToOne
    @JoinColumn(name = "account_category_id")
    private Mdl_account_category mdl_account_category;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Mdl_profile mdl_profile;

    @OneToMany(mappedBy = "mdl_account")
    @JsonIgnoreProperties("mdl_account")
    private List<Mdl_tarrif> mdl_tarrif_one;
    
    
    @OneToMany(mappedBy = "mdl_account")
    @JsonIgnoreProperties("mdl_account")
    private List<Mdl_booking> mdl_booking_one;

    @OneToMany(mappedBy = "mdl_account")
    @JsonIgnoreProperties("mdl_account")
    private List<Mdl_carwash> mdl_carwash_one;
    
    @OneToMany(mappedBy = "mdl_account")
    @JsonIgnoreProperties("mdl_account")
    private List<Mdl_chechout> mdl_chechout_one;
    
    @OneToMany(mappedBy = "mdl_account")
    @JsonIgnoreProperties("mdl_account")
    private List<Mdl_calendar> mdl_calendar_one;
   

}
