package com.jvlcode.Shopsphere.repository;

import com.jvlcode.Shopsphere.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {
    Optional<Order> findByReferenceId(String referenceId);
}
