package lo_inheritance;

public class Circle extends Shape {

   private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", " +
                "radius=" + radius +
                "} ";
    }

    @Override
    void draw() {
        System.out.println("In DRAW of Circle");
    }

    @Override
    public boolean equals(Object o) {

        // check if both objects are having same reference
        if (this == o) return true;

        // check if both objects are from different classes
        if (o == null || this.getClass() != o.getClass()) return false;

        // type cast to current class
        Circle circle = (Circle) o;

        // compare the required properties
        return Double.compare(radius, circle.radius) == 0;
    }

}
