package random;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] array;
    private int size;

    public DynamicArray() {
        this.array = (T[]) new Object[10];
    }

    public void add(T elem) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = elem;
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}

