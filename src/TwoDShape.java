public class TwoDShape {
    public double width;
    public double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        width = 0;
        height = 0;
    }

    /* this function is used to calculate the area of the 2d shape

     */
    public double getArea() {
        double area = width * height;
        return area;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
}
