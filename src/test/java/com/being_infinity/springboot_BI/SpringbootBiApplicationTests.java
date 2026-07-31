package com.being_infinity.springboot_BI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.being_infinity.springboot_BI.controller.HomeController;

@SpringBootTest
class SpringbootBiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void rootPathRedirectsToPracticeIndex() {
		HomeController homeController = new HomeController();
		org.junit.jupiter.api.Assertions.assertEquals("redirect:/Practice/index.html", homeController.home());
	}

}
