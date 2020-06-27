package by.zercomp.array.creator;

import by.zercomp.array.entity.ArrayWrapper;
import by.zercomp.array.exception.InvalidDataException;

import java.util.Optional;

public class ArrayCreator {

    private ArrayCreator(){
    }

    public static ArrayWrapper create() {
        return new ArrayWrapper();
    }

    public static ArrayWrapper create(int length) {
        try {
            return new ArrayWrapper(length);
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
        //compilation error
    }

}
