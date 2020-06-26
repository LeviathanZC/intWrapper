package by.zercomp.array.service;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;

public class MaxMinService {

    private MaxMinService() {
    }

    private static final int ZERO_LENGTH = 0;

    private static boolean isNull(ArrayWrapper arrayWrapper) {
        return arrayWrapper == null;
    }

    private static boolean hasZeroLength(ArrayWrapper arrayWrapper) {
        return arrayWrapper.getArray().length == ZERO_LENGTH;
    }

    public static int max(ArrayWrapper arrayWrapper) throws InvalidDataException {
        if (isNull(arrayWrapper) || hasZeroLength(arrayWrapper)) {
            throw new InvalidDataException("ArrayWrapper must be not null or have zero length");
        }
        int maxElement = arrayWrapper.get(0);
        final int end = arrayWrapper.length();
        for (int index = 0; index < end; index++) {
            maxElement = Math.max(maxElement, arrayWrapper.get(index));
        }
        return maxElement;
    }

    public static int min(ArrayWrapper arrayWrapper) throws InvalidDataException {
        if (arrayWrapper == null) {
            throw new InvalidDataException("ArrayWrapper must be not null");
        }
        int minElement = arrayWrapper.get(0);
        final int end = arrayWrapper.length();
        for (int index = 0; index < end; index++) {
            minElement = Math.min(minElement, arrayWrapper.get(index));
        }
        return minElement;
    }

}
