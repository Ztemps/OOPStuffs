package com.netmind.calculadora.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

import com.netmind.calculadora.Calculadora;

public class CalculadoraReflection {

	public static void main(String[] args) throws NoSuchMethodException,SecurityException ,
	IllegalAccessException , IllegalArgumentException , InvocationTargetException{
		
		Calculadora objetoCalculadora = new Calculadora();
		Class objetoInfoDeMiClase = null;
		try {
			objetoInfoDeMiClase = Class.forName("com.netmind.calculadora.Calculadora");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Method metodoGetSuma =null;
		Method metodoGetResta =null;
		Method metodoGetMultiplicacion=null;
		Method metodoGetDivision=null;
		
		int valorRetornoSuma = 0;
		int valorRetornoResta = 0;
		int valorRetornoMultiplicacion = 0;
		int valorRetornoDivision = 0;
		
		try {
			 metodoGetSuma = objetoInfoDeMiClase.getMethod("suma", int.class, int.class);
			 metodoGetResta = objetoInfoDeMiClase.getMethod("resta", int.class, int.class);
			 metodoGetMultiplicacion = objetoInfoDeMiClase.getMethod("multiplicacion", int.class, int.class);
			 metodoGetDivision = objetoInfoDeMiClase.getMethod("division", int.class, int.class);
			
			 valorRetornoSuma = (int) metodoGetSuma.invoke(objetoCalculadora, 10, 5);
			 valorRetornoResta = (int) metodoGetResta.invoke(objetoCalculadora, 10, 5);
			 valorRetornoMultiplicacion = (int) metodoGetMultiplicacion.invoke(objetoCalculadora, 10, 5);
			 valorRetornoDivision = (int) metodoGetDivision.invoke(objetoCalculadora, 10, 5);
			
			System.out.println("Suma: " + valorRetornoSuma);
			System.out.println("Resta: " + valorRetornoResta);
			System.out.println("Mutliplicacion: " + valorRetornoMultiplicacion);
			System.out.println("Division: " + valorRetornoDivision);
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
