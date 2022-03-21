package com.example.EssaiSpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class EssaiSpringBoot1Application implements CommandLineRunner{

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(EssaiSpringBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		HelloWorld hw = new bs.getHelloWorld();
		System.out.println(hw);
	}

}
