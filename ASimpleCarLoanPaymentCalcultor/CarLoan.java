public class CarLoan {
	public static void main(String[] args) {
        int carLoan = 10000;
        // Loan length of 3 years
        int loanLength = 3;
        // interest rate of 5%
        int interestRate = 5;
        // down payment for the car purchase
        int downPayment = 2000;
        if(loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        } else {

            int remainingBalance = carLoan - downPayment;
            // convert the loan length from years to months
            int months = loanLength * 12;
            // monthly pamyent without interest included
            int monthlyBalance = remainingBalance / months;
            // interest on the loan borrowed
            int interest = (monthlyBalance * interestRate) / 100;
            // Calculate the final monthly payment
            int monthlyPayment = monthlyBalance + interest;
            // Print out the monthly payment
            System.out.println(monthlyPayment);
        }

	

	}
}
