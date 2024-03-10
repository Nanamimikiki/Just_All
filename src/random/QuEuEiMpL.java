package random;

import java.util.ArrayList;

public class QuEuEiMpL<T> implements Queuelol<T>{
    private ArrayList<T> list = new ArrayList<T>();

    @Override
    public void add(T element) {
    list.add(element);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
