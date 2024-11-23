public class CharacterPrinter {
    private String word;

    public CharacterPrinter(String word) {
        this.word = word;
    }

    public void printCharacters() {
        for (char c : word.toCharArray()) {
            System.out.println(c);
        }
    }
}
