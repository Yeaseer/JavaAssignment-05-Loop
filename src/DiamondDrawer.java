public class DiamondDrawer {

    public void drawDiamond(int sideLength) {

        for (int i = 1; i <= sideLength; i++) {

            for (int j = i; j < sideLength; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = sideLength - 1; i >= 1; i--) {
            for (int j = sideLength; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
