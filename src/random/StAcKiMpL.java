package random;

import java.util.ArrayList;

public class StAcKiMpL<T> implements StackLol<T> {
    private ArrayList<T> list = new ArrayList<T>();

    @Override
    public void push(T element) {
    list.add(0, element);
    }

    @Override
    public void pop() {
        list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
