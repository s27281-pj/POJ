import java.util.Scanner;

public class Zadanie27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj promień podstawy walca: ");
        double radius = scanner.nextDouble();

        System.out.print("Podaj wysokość walca: ");
        double height = scanner.nextDouble();

        // Obliczanie pojemności walca
        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Pojemność walca: " + volume);
    }
}
