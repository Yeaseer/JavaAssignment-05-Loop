public class VowelCounter {
    private String word;
    public VowelCounter(String word) {
        this.word = word.toLowerCase();
    }

    public int countVowels() {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        return "aeiouy".indexOf(c) >= 0;
    }
}
