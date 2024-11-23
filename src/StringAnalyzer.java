import java.util.ArrayList;
import java.util.List;

public class StringAnalyzer {

    private String input;

    public StringAnalyzer(String input) {
        this.input = input;
    }

    public String getUppercaseLetters() {
        StringBuilder uppercaseLetters = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseLetters.append(c);
            }
        }
        return uppercaseLetters.toString();
    }

    public String getEverySecondLetter() {
        StringBuilder secondLetters = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            secondLetters.append(input.charAt(i));
        }
        return secondLetters.toString();
    }

    public String replaceVowelsWithUnderscore() {
        return input.replaceAll("[AEIOUaeiou]", "_");
    }

    public int countVowels() {
        int vowelCount = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public List<Integer> getVowelPositions() {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                positions.add(i);
            }
        }
        return positions;
    }
}
