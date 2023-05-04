public class TestCarAndSedan {
    public static void main(String[] args) {
        Car car = new Car(100, 20000.0, "Red");
        Sedan sedan = new Sedan(120, 30000.0, "Blue", 25);

        System.out.println("Car Sale Price: " + car.getSalePrice());
        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
    }
}