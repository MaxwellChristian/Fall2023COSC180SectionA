package lo_inheritance;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", " +
                "height=" + height +
                ", width=" + width +
                "} ";
    }
}
