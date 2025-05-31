package com.example.Payment_Scheduler.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String payerName;
    private Double amount;
    private LocalDateTime scheduledTime;
    private boolean paid;
    private boolean completed;
//    private String walletAddress;
    
    //Getters and Setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    
    public String getPayerName(){return payerName;}
    public void setPayerName(String payerName){this.payerName = payerName;}
    
    public Double getAmount(){return amount;}
    public void setAmount(double amount){this.amount = amount;}
    
    public LocalDateTime getScheduledTime(){return scheduledTime;}
    public void setScheduledTime(LocalDateTime scheduledTime){this.scheduledTime = scheduledTime;}
    
    public boolean isPaid(){return paid;}
    public void setPaid(boolean paid){this.paid = paid;}
    
    public boolean getCompleted(){return completed;}
    public void setCompleted(boolean completed){this.completed = completed;}
   
//    public String getWalletAddress(){return walletAddress;}
//    public void setWalletAddress(String walletAddress){this.walletAddress = walletAddress;}
}
