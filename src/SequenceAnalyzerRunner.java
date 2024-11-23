public class SequenceAnalyzerRunner {

    public static void main(String[] args) {
        SequenceAnalyzer analyzer = new SequenceAnalyzer();

        analyzer.readIntegers();

        analyzer.findSmallestLargest();
        analyzer.countEvenOdd();
        analyzer.cumulativeTotals();
        analyzer.findAdjacentDuplicates();
    }
}
