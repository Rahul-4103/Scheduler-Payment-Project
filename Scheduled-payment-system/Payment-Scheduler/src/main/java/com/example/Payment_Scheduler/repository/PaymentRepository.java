package com.example.Payment_Scheduler.repository;

import com.example.Payment_Scheduler.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
    List<Payment> findByScheduledTimeBeforeAndCompletedFalse(LocalDateTime now);
    
}
