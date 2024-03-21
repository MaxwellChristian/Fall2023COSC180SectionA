package lo_inheritance.multi_level;

public class B extends A{

    int bVar;

    public B() {
        System.out.println("B()");
    }

    @Override
    public String toString() {
        return "B{" +
                "bVar=" + bVar +
                "} " + super.toString();
    }
}
