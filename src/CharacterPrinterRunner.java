import java.util.Scanner;

public class  CharacterPrinterRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        CharacterPrinter printer = new CharacterPrinter(word);

        printer.printCharacters();

        scanner.close();
    }
}
