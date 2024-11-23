import java.util.Scanner;

public class CalculatorRunner{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEvens = Calculator.sumOfEvens();
        System.out.println("Sum of all even numbers between 2 and 100: " + sumEvens);

        int sumSquares = Calculator.sumOfSquares();
        System.out.println("Sum of all squares between 1 and 100: " + sumSquares);

        Calculator.powersOfTwo();

        System.out.print("Enter two integers (a and b) to compute the sum of all odd numbers between them: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumOdds = Calculator.sumOfOddsInRange(a, b);
        System.out.println("Sum of all odd numbers between " + a + " and " + b + ": " + sumOdds);

        System.out.print("Enter an integer to compute the sum of its odd digits: ");
        int number = scanner.nextInt();
        int sumOddDigits = Calculator.sumOfOddDigits(number);
        System.out.println("Sum of all odd digits of " + number + ": " + sumOddDigits);

        scanner.close();
    }
}
