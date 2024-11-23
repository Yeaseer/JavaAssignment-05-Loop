import java.util.Scanner;

public class MultiplicationTableRunner  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 10;

        MultiplicationTable multiplicationTable = new MultiplicationTable();

        multiplicationTable.printTable(size);

        scanner.close();
    }
}
