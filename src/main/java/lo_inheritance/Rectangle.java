package lo_inheritance;

// public: can be accessed outside the class
// private: can be accessed only inside the class
// protected: can be accessed only inside the class and subclasses

import java.util.Comparator;
import java.util.Objects;

public class Rectangle extends Shape implements Comparable<Rectangle>, Comparator<Rectangle> {

    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
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

    final public void printEdgesDimensions(){
        // final methods cannot be over ride
        System.out.println("Width: " + getWidth() + ", Height: " + getHeight());
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

    @Override
    public int compare(Rectangle pRect1, Rectangle pRect2) {
        return (int) (pRect1.width - pRect2.width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(height, rectangle.height) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    void draw() {
        System.out.println("In DRAW of Rectangle");
    }

    @Override
    public int compareTo(Rectangle pRect) {
        return (int) (this.width - pRect.width);
    }
}
