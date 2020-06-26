package by.zercomp.array.service;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;
import by.zercomp.array.validator.WrapperValidator;

public class MaxMinService {

    private MaxMinService() {
    }

    public static int max(ArrayWrapper arrayWrapper) throws InvalidDataException {
        if (WrapperValidator.isNullOrHasZeroLength(arrayWrapper)) {
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
            throw new InvalidDataException("ArrayWrapper must be not null or have zero length");
        }
        int minElement = arrayWrapper.get(0);
        final int end = arrayWrapper.length();
        for (int index = 0; index < end; index++) {
            minElement = Math.min(minElement, arrayWrapper.get(index));
        }
        return minElement;
    }

}
