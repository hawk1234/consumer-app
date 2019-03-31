package com.mz.consumer;

import com.mz.executor.consumer.BaseConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
@EnableScheduling
//@ComponentScan({"com.mz.executor", "com.mz.consumer"/*To be able to see components for this application*/})
public class EventConsumerApplication implements CommandLineRunner{

    @Autowired
    private List<BaseConsumer> consumers;

	public static void main(String[] args) {
		SpringApplication.run(EventConsumerApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Number of consumers: "+consumers.size());
    }
}
