package lo_inheritance.multi_level;

public class A {

    private int aVar;

    public A() {
        System.out.println("A()");
    }

    @Override
    public String toString() {
        return "A{" +
                "aVar=" + aVar +
                '}';
    }
}
