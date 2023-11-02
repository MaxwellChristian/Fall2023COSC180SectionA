package lo_oop;

import java.awt.image.CropImageFilter;

public class CircleTest {

    public static void main(String []artgws){

        Circle c1 = new Circle();
        c1.setRadius(1.0);

        System.out.println(c1.radius);
        System.out.println(c1.getArea());

        Circle c2 = new Circle();
        System.out.println(c2.radius);
        System.out.println(c2.getArea());

        Circle c3 = new Circle( 5.8 );
        System.out.println(c3.radius);
        System.out.println(c3.getArea());
    }

}
