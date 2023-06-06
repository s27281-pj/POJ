
public class Zadanie211 {
    public static void main(String[] args) {
        // Tworzenie obiektu typu Vehicle dla miniVan
        Vehicle miniVan = new Vehicle(5, 60.0, 8.5);

        // Tworzenie obiektu typu Vehicle dla sportsCar
        Vehicle sportsCar = new Vehicle(2, 50.0, 12.0);

        // Obliczanie i wyświetlanie zasięgu dla miniVan
        double miniVanRange = miniVan.calculateRange();
        System.out.println("Zasięg dla miniVan: " + miniVanRange + " km");

        // Obliczanie i wyświetlanie zasięgu dla sportsCar
        double sportsCarRange = sportsCar.calculateRange();
        System.out.println("Zasięg dla sportsCar: " + sportsCarRange + " km");
    }
}
