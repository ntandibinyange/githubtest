/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carwash.repository;

import com.carwash.models.Mdl_account_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SANGWA
 */

    @Repository
public interface AccountCategoryRepository extends JpaRepository<Mdl_account_category, Long>{
    
}
