package com.netmind.calculadora;

import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.println("Introduce primer numero:");
		int num1 = scr.nextInt();

		System.out.println("Introduce segundo numero: ");
		int num2 = scr.nextInt();

		System.out.println("La suma es: " + calculadora.suma(num1, num2));
		System.out.println("La resta es: " + calculadora.resta(num1, num2));
		System.out.println("La división es: " + calculadora.division(num1, num2));
		System.out.println("La multiplcación es: " + calculadora.multiplicacion(num1, num2));

	}
}
