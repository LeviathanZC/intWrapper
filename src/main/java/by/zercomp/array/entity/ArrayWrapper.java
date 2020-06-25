package by.zercomp.array.entity;

public class ArrayWrapper {

    private static final int START_INDEX = 0;
    private static final int DEFAULT_CAPACITY = 8;
    private int capacity;
    private int[] array;

    public ArrayWrapper() {
        this.capacity = DEFAULT_CAPACITY;
        this.array = new int[this.capacity];
    }

    public ArrayWrapper(int capacity) {
        this.array = new int[capacity];
    }

    public ArrayWrapper(int... elements) {
        this.capacity = elements.length;
        this.array = new int[capacity];
        for (int index = START_INDEX; index < this.capacity; index++) {
            this.array[index] = elements[index];
        }
    }

    public int get(int index) {
        return this.array[index];
    }

    public void set(int index, int value) {

    }

    public int capacity() {
        return this.capacity;
    }

}
