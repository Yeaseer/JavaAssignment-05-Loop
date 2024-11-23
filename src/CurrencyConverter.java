import java.util.Scanner;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToYen(double dollars) {
        return dollars * exchangeRate;
    }
}
