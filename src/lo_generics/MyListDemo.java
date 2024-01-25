package lo_generics;

public class MyListDemo {

    public static void main(String []args) {

        MyList ml = new MyList();

        ml.addData(11);
        ml.addData(12);

        System.out.println(ml);

        ml.addData(14);
        ml.addData(15);
        ml.addData(16);

        System.out.println(ml);

        ml.remove(14);
        System.out.println(ml);

    }

}
