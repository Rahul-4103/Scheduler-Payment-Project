package com.example.Payment_Scheduler.controller;

import com.example.Payment_Scheduler.model.Payment;
import com.example.Payment_Scheduler.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;
    
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Payment Controller Initialized...");
    }
    
    @PostMapping
    public ResponseEntity<?> createPayment(@RequestBody Payment payment){
        try{
            Payment savedPayments = paymentService.createPayment(payment);
            return ResponseEntity.ok(savedPayments);
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: "+e.getMessage());
        }
        
    }
    
    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
}
