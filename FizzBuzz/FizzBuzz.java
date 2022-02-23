public class FizzBuzz{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){ // For numbers which are multiples of both 3 and 5, print FizzBuzz.
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){ // For multiples of 3, print Fizz instead of the number.
                System.out.println("Fizz");
            } else if(i % 5 == 0){ // For the multiples of 5, print Buzz.
                System.out.println("Buzz");
            } else { // print number
                System.out.println(i);
            }
        }
    }
}
