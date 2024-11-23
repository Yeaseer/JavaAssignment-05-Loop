public class BinaryConverter {
    public void printBinaryDigits(int number) {
        StringBuilder binaryDigits = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            binaryDigits.insert(0, remainder);
            number = number / 2;
        }
        System.out.println("Binary representation: " + binaryDigits.toString());
    }
}
