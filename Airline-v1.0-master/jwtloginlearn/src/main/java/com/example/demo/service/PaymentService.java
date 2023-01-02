package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Payment;


public interface PaymentService {
	Long savePayment(Payment p);
	void updatePayment(Payment p);
	void deletePayment(Long card_num);
	Optional<Payment> getOnePayment(Long card_num);
	List<Payment> getAllPayment();
	boolean isPaymentExist(Long card_num);

}
