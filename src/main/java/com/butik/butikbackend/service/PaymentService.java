package com.butik.butikbackend.service;

import com.butik.butikbackend.entity.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getAllPayments();

    Payment savePayment(Payment payment);

    Payment getPaymentById(Long id);

    Payment updatePayment(Long id, Payment payment);

    void deletePayment(Long id);
}
