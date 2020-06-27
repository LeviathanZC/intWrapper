package by.zercomp.array.service.sort;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;

public class BubbleSort extends AbstractSort {

    private static final int SHIFT = 1;

    public BubbleSort() {
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
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (get(j) < get(j + SHIFT)) {
                    swap(get(j), get(j + SHIFT));
                }
            }
        }
    }

    private void swap(int firstIndex, int secondIndex) {
        final int frstValue = get(firstIndex);
        final int sndValue = get(secondIndex);
        set(firstIndex, sndValue);
        set(secondIndex, frstValue);
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
