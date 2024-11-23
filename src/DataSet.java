import java.util.ArrayList;
import java.util.List;

public class DataSet {
    private List<Double> values;

    public DataSet() {
        values = new ArrayList<>();
    }

    public void add(double value) {
        values.add(value);
    }

    public double getAverage() {
        if (values.isEmpty()) return 0;

        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public double getSmallest() {
        if (values.isEmpty()) return Double.NaN;

        double smallest = Double.MAX_VALUE;
        for (double value : values) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public double getLargest() {
        if (values.isEmpty()) return Double.NaN;

        double largest = Double.MIN_VALUE;
        for (double value : values) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public double getRange() {
        if (values.isEmpty()) return 0;
        return getLargest() - getSmallest();
    }
}
