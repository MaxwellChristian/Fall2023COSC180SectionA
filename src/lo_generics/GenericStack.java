package lo_generics;

import java.util.ArrayList;

public class GenericStack<E> {
    private final ArrayList<E> values;

    // focus on the default constructor
    // it does not need to have <E> specified
    public GenericStack() {
        values = new ArrayList<>();
    }

    public GenericStack(ArrayList<E> values) {
        this.values = values;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public int getSize() {
        return values.size();
    }

    public boolean push(E value) {
        return values.add(value);
    }

    public E pop() {
        return values.removeLast();
    }

    public E peek() {
        return values.getLast();
    }
}
