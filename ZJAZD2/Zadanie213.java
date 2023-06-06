public class Zadanie213 {
    public static void main(String[] args) {
        Vehicle213 miniVan = new Vehicle213("Minivan", 5, 60.0, 8.5);
        Vehicle213 sportsCar = new Vehicle213("Sports Car", 2, 50.0, 12.0);

        // Ustawianie wartości za pomocą setterów
        miniVan.setPassengers(7);
        miniVan.setFuelTankCapacity(70.0);
        miniVan.setFuelConsumption(9.0);

        System.out.println(miniVan.getDescription());
        System.out.println(sportsCar.getDescription());
    }
}