public class Zadanie215 {
    public static void main(String[] args) {
        Vehicle215 miniVan = new Vehicle215("Minivan", 5, 60.0, 8.5);
        Vehicle215 sportsCar = new Vehicle215("Sports Car", 2, 50.0, 12.0);

        // Ustawianie wartości za pomocą setterów
        miniVan.setPassengers(7);
        miniVan.setFuelTankCapacity(70.0);
        miniVan.setFuelConsumption(9.0);

        System.out.println(miniVan.getDescription());
        System.out.println(sportsCar.getDescription());

        double distance = 100.0; // Przykładowy dystans do przejechania

        double miniVanFuelRequired = miniVan.calculateFuelRequired(distance);
        double sportsCarFuelRequired = sportsCar.calculateFuelRequired(distance);

        System.out.println("Do przejechania dystansu " + distance + " km, MiniVan potrzebuje " + miniVanFuelRequired + " litrów paliwa.");
        System.out.println("Do przejechania dystansu " + distance + " km, Sports Car potrzebuje " + sportsCarFuelRequired + " litrów paliwa.");
    }
}