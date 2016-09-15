package com.netmind.calculadora.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.netmind.calculadora.Calculadora;

public class CalculadoraReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		try {
			
			Calculadora objetoCalculadora = new Calculadora();

			Class objetoInfoDeMiClase = Class.forName("com.netmind.calculadora.Calculadora");

			Method metodoGetSuma = objetoInfoDeMiClase.getMethod("suma", int.class, int.class);
			Method metodoGetResta = objetoInfoDeMiClase.getMethod("resta", int.class, int.class);
			Method metodoGetMultiplicacion = objetoInfoDeMiClase.getMethod("multiplicacion", int.class, int.class);
			Method metodoGetDivision = objetoInfoDeMiClase.getMethod("division", int.class, int.class);

			int valorRetornoSuma = (int) metodoGetSuma.invoke(objetoCalculadora, 10, 5);
			int valorRetornoResta = (int) metodoGetResta.invoke(objetoCalculadora, 10, 5);
			int valorRetornoMultiplicacion = (int) metodoGetMultiplicacion.invoke(objetoCalculadora, 10, 5);
			int valorRetornoDivision = (int) metodoGetDivision.invoke(objetoCalculadora, 10, 5);

			System.out.println("Suma: " + valorRetornoSuma);
			System.out.println("Resta: " + valorRetornoResta);
			System.out.println("Mutliplicacion: " + valorRetornoMultiplicacion);
			System.out.println("Division: " + valorRetornoDivision);

		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
