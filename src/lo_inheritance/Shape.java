package lo_inheritance;

public class Shape {

    public ShapeType type;

    private String color;

    public Shape() {
        System.out.println("Shape() constructor");
    }

    public Shape(String color) {
        this.color = color;
        System.out.println("Shape(color) constructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
