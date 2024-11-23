import java.util.Scanner;

public class StringPermuterRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to permute: ");
        String word = scanner.nextLine();

        StringPermuter permuter = new StringPermuter(word);

        String permutedWord = permuter.permute();

        System.out.println("Permuted word: " + permutedWord);

        scanner.close();
    }
}
