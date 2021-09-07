package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BownlingScroreApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void shouldHandleTheMostSimpleCasePossible() {
		Game g = new Game();
		g.roll(4);
		assertEquals(g.score(), 4);
		g.roll(2);
		assertEquals(g.score(), 6);
	}
}
