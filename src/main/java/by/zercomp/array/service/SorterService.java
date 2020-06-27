package by.zercomp.array.service;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.enumeration.SortType;
import by.zercomp.array.exception.InvalidDataException;
import by.zercomp.array.service.sort.BubbleSort;
import by.zercomp.array.service.sort.MergeSort;
import by.zercomp.array.service.sort.QuickSort;
import by.zercomp.array.service.sort.Sorter;

import static by.zercomp.array.enumeration.SortType.*;

public class SorterService {

    private SorterService() {
    }

    public static ArrayWrapper sort(ArrayWrapper src, SortType type) {
        try {
            if(src.length() == 0) {
                return new ArrayWrapper(0);
            }
            return defineSort(type).sort(src);
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
        return new ArrayWrapper();
    }

    private static Sorter defineSort(SortType type) throws InvalidDataException {
        switch (type) {
            case BUBBLE: {
                return new BubbleSort();
            }
            case MERGE: {
                return new MergeSort();
            }
            case QUICK: {
                return new QuickSort();
            }
            default: {
                throw new InvalidDataException("undefined type of sort:" + type);
            }
        }
    }

}
