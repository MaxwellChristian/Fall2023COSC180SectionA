package lo_inheritance.multi_level;

public class C extends B {

    int cVar;

    public C() {
        System.out.println("C()");
    }

    @Override
    public String toString() {
        return "C{" +
                "cVar=" + cVar +
                "} " + super.toString();
    }
}
