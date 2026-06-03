package com.butik.butikbackend.service.impl;

import com.butik.butikbackend.entity.Order;
import com.butik.butikbackend.repository.OrderRepository;
import com.butik.butikbackend.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public Order updateOrder(Long id, Order order) {

        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        existingOrder.setOrderDate(order.getOrderDate());
        existingOrder.setTotalAmount(order.getTotalAmount());
        existingOrder.setStatus(order.getStatus());

        return orderRepository.save(existingOrder);
    }

    @Override
    public void deleteOrder(Long id) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        orderRepository.delete(order);
    }
}
