package controller;

import data.DataStorage;
import data.Calculation;

public class Controller {
	
	private DataStorage dataStorage;
	
	public Controller() {
		this.dataStorage = new DataStorage();
	}
	
	public int add(int number1, int number2) {
		int result = number1+number2;
		Calculation calc = new Calculation(number1, number2, '+', result);
		this.dataStorage.addCalc(calc);
		return result;
	}

	public int subtract(int number1, int number2) {
		int result = number1-number2;
		Calculation calc = new Calculation(number1, number2, '-', result);
		this.dataStorage.addCalc(calc);
		return result;
	}

	public int multiply(int number1, int number2) {
		int result = number1*number2;
		Calculation calc = new Calculation(number1, number2, '*', result);
		this.dataStorage.addCalc(calc);
		return result;
	}

	public double divide(int number1, int number2) {
		double result = 1.0*number1/number2;
		Calculation calc = new Calculation(number1, number2, '/', result);
		this.dataStorage.addCalc(calc);
		return result;
	}

	public Calculation[] getAllCalculations() {
		return this.dataStorage.getAllCalculations();
	}

	public void deleteCalculation(int index) {
		this.dataStorage.deleteCalculation(index);
		
	}

	public void editCalculation(int index, Calculation newCalc) {
		this.dataStorage.editCalculation(index, newCalc);
		
	}
}
