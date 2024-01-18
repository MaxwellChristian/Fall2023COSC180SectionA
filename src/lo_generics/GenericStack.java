package lo_generics;

import java.util.ArrayList;

public class GenericStack<E> {
    private final ArrayList<E> values;

    // focus on the default constructor
    // it does not need to have <E> specified
    public GenericStack() {
        this.values = null;
    }

    public GenericStack(ArrayList<E> values) {
        this.values = values;
    }

    public boolean isEmpty() {
        assert values != null;
        return values.isEmpty();
    }

    public int getSize() {
        assert values != null;
        return values.size();
    }

    public boolean push(E value) {
        assert values != null;
        return values.add(value);
    }

    public E pop() {
        assert values != null;
        return values.removeLast();
    }

    public E peek() {
        assert values != null;
        return values.getLast();
    }
}
