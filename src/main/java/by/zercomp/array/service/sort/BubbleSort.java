package by.zercomp.array.service.sort;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;

import java.sql.SQLException;

public class BubbleSort implements Sorter {

    private BubbleSort() {
    }

    private static ArrayWrapper wrapper;

    @Override
    public ArrayWrapper sort(ArrayWrapper array) {
        this.wrapper = array;
        //time stub
        return null;
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
