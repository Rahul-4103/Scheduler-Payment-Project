package com.example.Payment_Scheduler.scheduler;

import com.example.Payment_Scheduler.service.PaymentService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class PaymentScheduler {
    private final PaymentService paymentService;
    
    public PaymentScheduler(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    
    //Run every minute
    @Scheduled(fixedRate = 60000)
    public void runPayments(){
        System.out.println("Scheduler running...");
        paymentService.runScheduledPayment();
    }
}
