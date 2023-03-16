/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.repository;

import com.carwash.models.Mdl_profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SANGWA
 */
@Repository
public interface ProfileRepository extends JpaRepository<Mdl_profile, Long>{
    
}