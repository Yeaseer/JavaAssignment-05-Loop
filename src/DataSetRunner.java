import java.util.Scanner;

public class DataSetRunner {

    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a set of floating-point values separated by spaces:");

        String[] inputs = scanner.nextLine().split(" ");

        for (String input : inputs) {
            try {
                double value = Double.parseDouble(input);
                dataSet.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + input + "' is not a valid floating-point number.");
            }
        }

        scanner.close();

        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());
    }
}
