package lo_inheritance.multi_level;

final public class C extends B {
    // final class cannot be inherited

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
