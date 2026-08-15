package br.com.nicolas.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSEIgualADois() {
		
		int a = 1+1;
		
		assertEquals(2, a);		
	}
	
	@Test
	void testarSeIgualATres() {
		
		int x = 3 - 0 + 7;
		
		assertEquals(10, x);
	}

}
