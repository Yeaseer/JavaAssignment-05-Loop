import java.util.Random;

public class StringPermuter {
    private String word;
    private Random random;

    public StringPermuter(String word) {
        this.word = word;
        this.random = new Random();
    }

    public String permute() {
        String permutedWord = word;

        for (int k = 0; k < word.length(); k++) {

            int i = random.nextInt(word.length() - 1);

            int j = random.nextInt(word.length() - i - 1) + i + 1;

            permutedWord = swapCharacters(permutedWord, i, j);
        }

        return permutedWord;
    }

    private String swapCharacters(String str, int i, int j) {
        String first = str.substring(0, i);
        String middle = str.substring(i + 1, j);
        String last = str.substring(j + 1);

        return first + str.charAt(j) + middle + str.charAt(i) + last;
    }
}
