package by.zercomp.array.service.sort;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;

public abstract class AbstractSort implements Sorter {

    private static ArrayWrapper wrapper;

    @Override
    public ArrayWrapper sort(ArrayWrapper array) {
        return null;
    }

    protected int get(int index) {
        try {
            return wrapper.get(index);
        } catch (InvalidDataException e) {
            e.printStackTrace();
            return Integer.MIN_VALUE;
        }
    }

    protected void set(int index, int value) {
        try {
            wrapper.set(index, value);
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }
}
