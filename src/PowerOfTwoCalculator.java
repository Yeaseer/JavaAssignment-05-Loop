public class PowerOfTwoCalculator {
    public void printPowersOfTwo() {
        for (int i = 20; i <= 220; i++) {
            long power = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
    }
}
