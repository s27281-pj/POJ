import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię studenta:");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko studenta:");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj numer grupy studenta:");
        String grupa = scanner.nextLine();

        System.out.println("Podaj kierunek studiów studenta:");
        String kierunek = scanner.nextLine();

        System.out.println("Dane studenta:");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Grupa: " + grupa);
        System.out.println("Kierunek studiów: " + kierunek);
    }
}
