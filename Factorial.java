import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.println("This program identifies if a number is a factorial of any natural number.");
        int input = getInput();
        boolean fact = isFactorial(input);
        if (fact) {
            System.out.println(input + " is a factorial number.");
        }
        else {
            System.out.println(input + " is not a factorial number.");
        }
    }
    
    public static int getInput() 
    {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("\nEnter a natural number (int > 0): ");
            while (!input.hasNextInt()) {
                String inputstr = input.next();
                System.out.printf(inputstr + " is invalid. Enter a natural number (int > 0): ");
            }
            number = input.nextInt();
        } while (number <= 0);
        return number;
    }
    
    public static boolean isFactorial(int input) 
    {
        int i = 1;
        int fact = i;
        while (fact != input) {
            fact = fact * i;
            i++;
            if (fact > input) {
                return false;
            }
        }
        return true;
    }
}