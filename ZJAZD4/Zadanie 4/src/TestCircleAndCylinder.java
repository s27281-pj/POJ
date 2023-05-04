public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1); // Circle with radius=1.0 and color=blue

        Circle c2 = new Circle(2.5);
        System.out.println(c2); // Circle with radius=2.5 and color=blue

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1); // Circle with radius=1.0 and color=blue, Cylinder with height=4.0

        Cylinder cy2 = new Cylinder(2.5);
        System.out.println(cy2); // Circle with radius=2.5 and color=blue, Cylinder with height=4.0

        Cylinder cy3 = new Cylinder(2.5, 5.0);
        System.out.println(cy3); // Circle with radius=2.5 and color=blue, Cylinder with height=5.0

        System.out.println(cy3.getVolume()); // 98.17477042468103
    }
}
