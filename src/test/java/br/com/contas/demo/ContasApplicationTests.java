package br.com.contas.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;



@SpringBootTest
class ContasApplicationTests {
	ContasService underTest = new ContasService();
	@Test
	void hasMedia() {
		// given
		List<Integer> lista = new ArrayList<>();
		lista.add(4);
		lista.add(7);
		lista.add(2);
		lista.add(8);

		//when
		Double result = underTest.calcularMedia(lista);
		Double expected = 5d;
		//then
		Assert.assertEquals(result, expected);
	}
	@Test
	void hasMediana() {
		// given
		List<Integer> lista = new ArrayList<>();
		lista.add(4);
		lista.add(7);
		lista.add(2);
		lista.add(8);

		//when
		Double result = underTest.calcularMediana(lista);
		Double expected = 4d;
		//then
		Assert.assertEquals(result, expected);
	}
	@Test
	void hasDesvioPadrao() {
		// given
		List<Integer> lista = new ArrayList<>();
		lista.add(4);
		lista.add(7);
		lista.add(2);
		lista.add(8);

		//when
		Double result = underTest.calcularDesvioPadrao(lista,5d);
		Double expected = 1.2;
		//then
		Assert.assertEquals(result, expected);
	}



}
