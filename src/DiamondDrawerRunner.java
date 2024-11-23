import java.util.Scanner;

public class DiamondDrawerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the diamond: ");
        int sideLength = scanner.nextInt();

        DiamondDrawer drawer = new DiamondDrawer();

        drawer.drawDiamond(sideLength);

        scanner.close();
    }
}
