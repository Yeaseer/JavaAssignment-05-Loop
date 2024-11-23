import java.util.*;

public class BinaryConverterRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        BinaryConverter converter = new BinaryConverter();

        converter.printBinaryDigits(number);

        scanner.close();
    }
}
