import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SequenceAnalyzer {

    private List<Integer> numbers;

    public SequenceAnalyzer() {
        this.numbers = new ArrayList<>();
    }

    public void readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers separated by spaces:");
        String[] input = scanner.nextLine().split(" ");

        for (String s : input) {
            try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + s + " is not an integer.");
            }
        }
    }

    public void findSmallestLargest() {
        if (numbers.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }

    public void countEvenOdd() {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount + ", Odd numbers: " + oddCount);
    }

    public void cumulativeTotals() {
        List<Integer> cumulative = new ArrayList<>();
        int total = 0;

        for (int num : numbers) {
            total += num;
            cumulative.add(total);
        }

        System.out.print("Cumulative totals: ");
        for (int num : cumulative) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void findAdjacentDuplicates() {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1)) &&
                    (duplicates.isEmpty() || !duplicates.get(duplicates.size() - 1).equals(numbers.get(i)))) {
                duplicates.add(numbers.get(i));
            }
        }

        System.out.print("Adjacent duplicates: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
