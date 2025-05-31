package com.example.Payment_Scheduler;



//import com.example.Payment_Scheduler.controller.PaymentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages = "com.example.Payment_Scheduler")
@EnableScheduling
//@ComponentScan(basePackages = "com.example.PackageSchedulerApplication")
public class PaymentSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSchedulerApplication.class, args);
	}

}
