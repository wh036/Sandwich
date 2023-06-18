package data;

public class Calculation {
	private int operand1;
	private int operand2;
	private char operator;
	private double result;
	
	public Calculation() {
		this.operand1 = 0;
		this.operand2 = 0;
		this.operator = '~';
		this.result = 0;
	}
	
	public Calculation(int operand1, int operand2, char operator, double result) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
		this.result = result;	
	}
	
	public int getOperand1() {
		return operand1;
	}
	
	public int getOperand2() {
		return operand2;
	}
	
	public char getOp() {
		return operator;
	}
	
	public double getResult() {
		return result;
	}
	
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public void setResult(double result) {
		this.result = result;
	}
}//end class
