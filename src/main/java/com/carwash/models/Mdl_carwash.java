package com.carwash.models;
import com.carwash.models.Mdl_account;
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

@Setter
@Getter
@Entity
@Table(name = "carwash")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Mdl_carwash implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carwash_id", length = 100)
    private long carwash_id;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "loc_sector", length = 100)
    private String loc_sector;

    @Column(name = "loc_district", length = 100)
    private String loc_district;

    @Column(name = "account", length = 100)
    private long account;

    public Mdl_carwash(String name, String loc_sector, String loc_district, long account) {
        this.name = name;
        this.loc_sector = loc_sector;
        this.loc_district = loc_district;
        this.account = account;
    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Mdl_account mdl_account;
 
}
