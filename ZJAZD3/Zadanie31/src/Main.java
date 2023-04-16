public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.0, "blue");

        Circle c4 = new Circle();
        c4.setRadius(4.0);
        c4.setColor("green");

        System.out.println(c1.toString() + ", area: " + c1.getArea());
        System.out.println(c2.toString() + ", area: " + c2.getArea());
        System.out.println(c3.toString() + ", area: " + c3.getArea());
        System.out.println(c4.toString() + ", area: " + c4.getArea());
    }
}
