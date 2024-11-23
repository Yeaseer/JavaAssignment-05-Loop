import java.util.Scanner;

public class VowelCounterRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        VowelCounter vowelCounter = new VowelCounter(word);

        int numberOfVowels = vowelCounter.countVowels();

        System.out.println(numberOfVowels + " vowel(s)");

        scanner.close();
    }
}
