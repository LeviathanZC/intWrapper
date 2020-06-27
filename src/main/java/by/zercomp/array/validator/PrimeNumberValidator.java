package by.zercomp.array.validator;

public class PrimeNumberValidator {

    private PrimeNumberValidator() {
    }

    public static boolean isPrime(int number) {
        if (number < 0) {
            return false;
        }
        /*
            Варинты проверки (i < number) - все числа
                             (i < (number/2)) - до половины
                             (i < sqrt(number)) - до корня из этого числа
            Выбран последний вариант, т.к. остальные варианты накладывают
            дополнительный overhead на проверку лишних значений.
         */
        final int end = (int)Math.sqrt(number);
        for (int i = 2; i < end; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
