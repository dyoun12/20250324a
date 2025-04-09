package edu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Stept07CicdApplicationTests {

	@Test
	public void testAddition() {
		int result = 12 + 3;
		System.out.println("비교전 ------");
		assertEquals(15, result);
		System.out.println("비교후 ------");
	}

}
