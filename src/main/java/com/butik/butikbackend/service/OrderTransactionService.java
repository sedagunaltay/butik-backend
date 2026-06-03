package com.butik.butikbackend.service;

import com.butik.butikbackend.entity.Order;
import com.butik.butikbackend.entity.Payment;
import com.butik.butikbackend.repository.OrderRepository;
import com.butik.butikbackend.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderTransactionService {

    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;

    public OrderTransactionService(OrderRepository orderRepository,
                                   PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    public void createOrderAndPayment(Order order, Payment payment) {

        Order savedOrder = orderRepository.save(order);

        payment.setOrder(savedOrder);

        paymentRepository.save(payment);
    }
}
