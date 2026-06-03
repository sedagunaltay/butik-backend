package com.butik.butikbackend.repository;

import com.butik.butikbackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
