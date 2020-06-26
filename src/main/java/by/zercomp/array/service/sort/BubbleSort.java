package by.zercomp.array.service.sort;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;

import java.sql.SQLException;

public class BubbleSort implements Sorter {

    private static final int SHIFT = 1;

    private BubbleSort() {
    }
    private static ArrayWrapper wrapper;

    @Override
    public ArrayWrapper sort(ArrayWrapper array) {
        wrapper = array;
        bubbleSort();
        return wrapper;
    }

    private void bubbleSort() {
        final int length = wrapper.length();
        try {
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    if (get(j) < get(j + SHIFT)) {
                        swap(get(j), get(j + SHIFT));
                    }
                }
            }
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }

    private void swap(int firstIndex, int secondIndex) {
        try {
            final int frstValue = get(firstIndex);
            final int sndValue = get(secondIndex);
            set(firstIndex, sndValue);
            set(secondIndex, frstValue);
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }

    private int get(int index) throws InvalidDataException {
        return wrapper.get(index);
    }

    private void set(int index, int value) throws InvalidDataException {
        wrapper.set(index, value);
    }


}
