package by.zercomp.array.validator;

public class ArithmeticValidator {

    private ArithmeticValidator() {
    }

    public static boolean isPositive(int value) {
        return value > 0;
    }

    public static boolean isNegative(int value) {
        return value < 0;
    }

}
