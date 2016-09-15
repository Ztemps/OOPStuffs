package com.netmind.calculadora;

public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora(){
		
	}
	
	
	public Calculadora(int num1,int num2){
		setNum1(num1);
		setNum2(num2);
	}
	
	public int suma(int num1, int num2){
	
		return num1 + num2;
	}
	
	
	public int suma(){
	
		return getNum1()+getNum2();
		
	}
	
	public int resta(int num1, int num2){
		
		return num1 - num2;
	}
	
	public int resta(){
		
		return getNum1()-getNum2();
	}
	
	
	public int multiplicacion(int num1, int num2){
		
		return num1 * num2;
	}

	public int division(int num1, int num2){
		
		return num1 / num2;
	}
	
	
	
	
	
	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}



}
