package com.example.EssaiSpringBoot1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import EssaiSpringBoot1.src.main.java.com.example.EssaiSpringBoot1.service.BuisnessService;

@SpringBootTest
class EssaiSpringBoot1ApplicationTests {

	@Autowired
	private BuisnessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	void getHelloWorldTest(){
		String expected = "Hello World!";

		String result = bs.getHelloWorld().getValue();

		assertEquals(expected, result)
	}

}
