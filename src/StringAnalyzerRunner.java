import java.util.List;
import java.util.Scanner;

public class StringAnalyzerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringAnalyzer analyzer = new StringAnalyzer(input);

        System.out.println("Uppercase letters: " + analyzer.getUppercaseLetters());

        System.out.println("Every second letter: " + analyzer.getEverySecondLetter());

        System.out.println("String with vowels replaced: " + analyzer.replaceVowelsWithUnderscore());

        System.out.println("Number of vowels: " + analyzer.countVowels());

        List<Integer> vowelPositions = analyzer.getVowelPositions();
        System.out.println("Positions of vowels: " + vowelPositions);

        scanner.close();
    }
}
