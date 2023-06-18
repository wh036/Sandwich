package data;

import java.util.Vector;

public class DataStorage {
	
	private Vector<Calculation> calcList;

	public DataStorage() {
		this.calcList = new Vector<Calculation>();
	}

	public void addCalc(Calculation calc) {
		this.calcList.add(calc);
	}

	public Calculation[] getAllCalculations() {
		Calculation[] opArr = new Calculation[this.calcList.size()];
		this.calcList.toArray(opArr);
		return opArr;
	}

	public void deleteCalculation(int index) {
		calcList.removeElementAt(index);
		
	}

	public void editCalculation(int index, Calculation newCalc) {
		this.calcList.set(index, newCalc); 
		
	}
}//end class

