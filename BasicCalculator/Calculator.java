/*
* The calculator will be able to:
* - Add two integers
* - Multiply two integers
* - Divide two integers
* - Apply the modulo operator on two integers
*/
public class Calculator{
	// Constructor 
	public Calculator(){}
	// add method
	public int add(int a, int b){
		return a + b;
	}
	// subtract method	
	public int subtract(int a, int  b){
		return a - b;
	}
	// multiply method
	public int multipl(int a, int b){
		return a * b;
	}
	// divide method
	public int divide(int a, int b){
		return a / b;
	}
	// modulo method
	public int modulo(int a, int b){
		return a % b;
	}
	public static void main(String[] args){
		Calculator myCalculator = new Calculator();
		System.out.println(myCalculator.add(5,7));
		System.out.println(myCalculator.subtract(45,11));
		
	}
}