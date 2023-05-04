// Circle class
public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return "Circle with radius=" + this.radius + " and color=" + this.color;
    }
}


