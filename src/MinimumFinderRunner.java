import java.util.Scanner;

public class MinimumFinderRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinimumFinder minFinder = new MinimumFinder();

        System.out.println("Enter numbers separated by spaces (or press Enter to finish):");

        String[] inputs = scanner.nextLine().split(" ");

        for (String input : inputs) {
            try {
                double value = Double.parseDouble(input);
                minFinder.processValue(value);
            } catch (NumberFormatException e) {
                System.out.println("'" + input + "' is not a valid number and will be ignored.");
            }
        }

        Double minimum = minFinder.getMinimum();
        if (minimum != null) {
            System.out.println("The minimum value is: " + minimum);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}
