package com.butik.butikbackend.service;

import com.butik.butikbackend.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order saveOrder(Order order);

    Order getOrderById(Long id);

    Order updateOrder(Long id, Order order);

    void deleteOrder(Long id);
}
