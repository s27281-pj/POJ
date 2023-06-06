import java.util.Random;
import java.util.Scanner;

public class Zadanie29 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char targetLetter = (char) (random.nextInt(26) + 'a');
        char guessedLetter;

        do {
            System.out.print("Wciśnij klawisz z zakresu a-z: ");
            guessedLetter = scanner.nextLine().charAt(0);

            if (guessedLetter == targetLetter) {
                System.out.println("Dobrze!");
                break;
            } else {
                System.out.println("Źle!");
                System.out.println("Podpowiedź: Klawisz znajduje się w alfabecie " + compareLetters(guessedLetter, targetLetter) + " od wylosowanego klawisza.");
            }
        } while (true);
    }

    public static String compareLetters(char guessedLetter, char targetLetter) {
        if (guessedLetter < targetLetter) {
            return "przed";
        } else {
            return "za";
        }
    }
}
