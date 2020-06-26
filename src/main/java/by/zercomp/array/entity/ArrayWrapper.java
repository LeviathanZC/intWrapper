package by.zercomp.array.entity;

import by.zercomp.array.exception.InvalidDataException;

public class ArrayWrapper {

    private static final int START_INDEX = 0;
    private static final int DEFAULT_CAPACITY = 8;
    private final int length;
    private final int[] array;

    public ArrayWrapper() {
        this.length = DEFAULT_CAPACITY;
        this.array = new int[this.length];
    }

    public ArrayWrapper(int length) throws InvalidDataException {
        validateIndexCtr(length);
        this.length = length;
        this.array = new int[length];
    }

    public ArrayWrapper(int... elements) {
        this.length = elements.length;
        this.array = new int[length];
        for (int index = START_INDEX; index < this.length; index++) {
            this.array[index] = elements[index];
        }
    }

    public int get(int index) throws InvalidDataException {
        validateIndex(index);
        return this.array[index];
    }

    public void set(int index, int value) throws InvalidDataException {
        validateIndex(index);
        this.array[index] = value;
    }

    public int length() {
        return this.length;
    }

    public int[] getArray() {
        return this.array;
    }

    private void validateIndex(int index) throws InvalidDataException {
        if (index < START_INDEX || index >= this.length) {
            throw new InvalidDataException("index out of range: " + index);
        }
    }

    private void validateIndexCtr(int index) throws InvalidDataException {
        if (index < START_INDEX) {
            throw new InvalidDataException("index out of range: " + index);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array {");
        for (int index = START_INDEX; index < this.length; index++) {
            sb.append(this.array[index]);
            if (index != this.array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public int hashCode(){
        final int prime = 113;
        int result = length;
        for (int value: this.array) {
            result += prime * value;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        //проверяем один и тот же объект
        if(this == o) {
            return true;
        }
        //исключаем NPE и различие классов
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }

        ArrayWrapper other = (ArrayWrapper) o;
        if (this.length != other.length) {
            return false;
        }
        final int[] otherArray = other.getArray();
        for (int index = 0; index < this.length; index++) {
            if (this.array[index] != otherArray[index]) {
                return false;
            }
        }
        return true;
    }
}
