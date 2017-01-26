package com.rsm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
@EnableBinding(Sink.class)
public class LogSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogSinkApplication.class, args);
	}
	
	@ServiceActivator(inputChannel = Sink.INPUT)
	public void logMessages(Greeting message) {
		System.out.println("Greeting is  :"+message.getGreeting());
	}
	
	/*@ServiceActivator(inputChannel = Sink.INPUT)
	public void logMessages(String message) {
		System.out.println("Greeting is64 :"+message);
	}*/
}
