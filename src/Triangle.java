import java.lang.Math;
public class Triangle extends TwoDShape{
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight() {
        return (side1 + side2 + side3)/2;
    }

    public double getArea() {
        double s = heronsHeight();
        return Math.sqrt(s * (s - side1)*(s - side2)*(s - side3));
    }
}
