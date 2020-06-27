package by.zercomp.array.service;

import by.zercomp.array.creator.ArrayCreator;
import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;
import by.zercomp.array.validator.PrimeNumberValidator;

public class ExtractService {

    public static ArrayWrapper extractPrimes(ArrayWrapper arrayWrapper) {
        final int length = arrayWrapper.length();
        if(length == 0) {
            return ArrayCreator.create(0);
        }
        int[] primeArr = new int[arrayWrapper.length()];
        for (int i = 0; i < length; i++) {
            try {
                if(PrimeNumberValidator.isPrime(arrayWrapper.get(i))) {
                    primeArr[i]
                }
            } catch (InvalidDataException e) {
                e.printStackTrace();
            }
        }
        //compilation error
    }
    
    private static ArrayWrapper fillWith(ArrayWrapper dest, int[] values) {
        //compilation error
    }

}
