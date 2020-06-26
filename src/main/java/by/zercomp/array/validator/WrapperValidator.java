package by.zercomp.array.validator;

import by.zercomp.array.entity.ArrayWrapper;

public class WrapperValidator {

    private static final int ZERO_LENGTH = 0;

    private static boolean isWrapperNull(ArrayWrapper arrayWrapper) {
        return arrayWrapper == null;
    }

    private static boolean hasZeroLength(ArrayWrapper arrayWrapper) {
        return arrayWrapper.getArray().length == ZERO_LENGTH;
    }

    public static boolean isNullOrHasZeroLength(ArrayWrapper arrayWrapper) {
        return isWrapperNull(arrayWrapper) || hasZeroLength(arrayWrapper);
    }

}
