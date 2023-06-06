public class Zadanie212 {
    public static void main(String[] args) {
        Vehicle212 miniVan = new Vehicle212(5, 60.0, 8.5);
        Vehicle212 sportsCar = new Vehicle212(2, 50.0, 12.0);

        // Ustawianie wartości za pomocą setterów
        miniVan.setPassengers(7);
        miniVan.setFuelTankCapacity(70.0);
        miniVan.setFuelConsumption(9.0);

        sportsCar.setPassengers(2);
        sportsCar.setFuelTankCapacity(60.0);
        sportsCar.setFuelConsumption(10.0);

        miniVan.range();
        sportsCar.range();
    }
}