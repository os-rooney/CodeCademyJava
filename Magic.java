public class Magic{
	/*
	* This is a small program that performs a mathematical magic trick!
	* It will involve performing arithmetic operations on an integer that you choose.
	* 3 will be printed to the console no matter  what integer you choose as the original number!
	*/
	public  static void main(String[] args){
		// myNumber is the original number
		int myNumber = 13;
		int magicNumber = (((myNumber*myNumber + myNumber)/ myNumber) + 17 - myNumber) / 6;
		
		System.out.println(magicNumber);
		
	}
}