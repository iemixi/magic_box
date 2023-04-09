package ru.netology.magic_box;

import java.util.Random;

public class MagicBox <T>{
    private final int boxSize;
    private int objectsAmount;
    private final Random random;
    private final T[] items;

    public MagicBox(int boxSize) {
        this.boxSize = boxSize;
        this.objectsAmount = 0;
        this.random = new Random();
        this.items = (T[]) new Object[boxSize];
    }

    public boolean add(T item) {
        if (this.objectsAmount == this.boxSize) {
            return false;
        } else {
            this.items[this.objectsAmount] = item;
            ++this.objectsAmount;
            return true;
        }
    }

    public T pick() {
        if (this.objectsAmount < this.boxSize) {
            throw new RuntimeException(String.format("Коробка еще не полная. Осталось добавить %d элементов", this.boxSize - this.objectsAmount));
        } else {
            int itemIndex = this.random.nextInt(this.boxSize);
            return this.items[itemIndex];
        }
    }
}
