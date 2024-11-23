public class Calculator {
    public static int sumOfEvens() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void powersOfTwo() {
        System.out.print("Powers of 2 from 2^0 to 2^20: ");
        for (int i = 0; i <= 20; i++) {
            System.out.print((int)Math.pow(2, i) + " ");
        }
        System.out.println();
    }

    public static int sumOfOddsInRange(int a, int b) {
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOfOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
