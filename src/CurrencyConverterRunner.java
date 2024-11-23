import java.util.Scanner;

public class CurrencyConverterRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's price for one dollar in Japanese yen: ");
        double exchangeRate = scanner.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(exchangeRate);

        System.out.println("Enter U.S. dollar values to convert to yen (enter 0 to stop): ");

        while (true) {
            double dollars = scanner.nextDouble();

            if (dollars == 0) {
                break;
            }

            double yen = converter.convertToYen(dollars);
            System.out.printf("%.2f dollars is %.2f yen.%n", dollars, yen);
        }

        scanner.close();
    }
}
