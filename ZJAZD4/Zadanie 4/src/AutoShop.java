public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 30000.0, "Blue", 25);
        Ford ford1 = new Ford(110, 40000.0, "Black", 2022, 5000);
        Ford ford2 = new Ford(90, 35000.0, "White", 2023, 2000);
        Truck truck = new Truck(80, 45000.0, "Yellow", 2500);

        System.out.println("SEDAN: " + sedan.getSalePrice());
        System.out.println("FORD1: " + ford1.getSalePrice());
        System.out.println("FORD2: " + ford2.getSalePrice());
        System.out.println("TRUCK: " + truck.getSalePrice());
    }
}
