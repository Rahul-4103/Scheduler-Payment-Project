package com.example.Payment_Scheduler.service;

import com.example.Payment_Scheduler.model.Payment;
import com.example.Payment_Scheduler.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    
    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }
    public Payment createPayment(Payment payment){
        payment.setCompleted(false);
        return paymentRepository.save(payment);
    }
    
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
    public void runScheduledPayment(){
        List<Payment> duePayments = paymentRepository.findByScheduledTimeBeforeAndCompletedFalse(LocalDateTime.now());
        for(Payment payment: duePayments){
            //simulated payment logic
            payment.setCompleted(true);
            paymentRepository.save(payment);
            System.out.println("Payment processed for: "+ payment.getPayerName());
        }
    }
}
