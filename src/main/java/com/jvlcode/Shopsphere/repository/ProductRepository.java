package com.jvlcode.Shopsphere.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jvlcode.Shopsphere.entity.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProductRepository extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {


}
