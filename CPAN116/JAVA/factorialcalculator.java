import java.util.Scanner;

public class factorialcalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("You should enter a number to calculate its factorial");
            if (scn.hasNextInt()) {
                int number = scn.nextInt();
                if (number < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    long factorial = calculateFactorial(number);
                    System.out.println("The factorial of " + number + " is: " + factorial);
                }
            } else if (scn.hasNext("exit")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer or 'exit' to quit.");
                scn.next(); // Clear the invalid input
            }
        }
        scn.close();
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;



        
    }
}