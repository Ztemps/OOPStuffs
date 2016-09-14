package com.netmind.calculadora.integration.test;

import static org.junit.Assert.*; 

import org.junit.Test;

import com.netmind.calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.suma(2, 3);
		assertTrue(resultado==5);
	}

	@Test
	public void testResta() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.resta(2, 3);
		assertTrue(resultado==-1);	
		}

	@Test
	public void testMultiplicacion() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplicacion(2, 3);
		assertTrue(resultado==6);
	}

	@Test
	public void testDivision() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.division(4, 2);
		assertTrue(resultado==2);
	}

}
