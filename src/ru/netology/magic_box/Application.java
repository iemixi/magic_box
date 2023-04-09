package ru.netology.magic_box;

public class Application {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        magicBox.add(1);
        magicBox.add(2);
        magicBox.add(3);
        
        System.out.println(magicBox.pick());
        System.out.println(magicBox.pick());
        System.out.println(magicBox.pick());
        
        MagicBox<String> stringMagicBox = new MagicBox<>(4);
        stringMagicBox.add("one");
        stringMagicBox.add("two");
        stringMagicBox.add("three");
        System.out.println(stringMagicBox.add("four"));
        System.out.println(stringMagicBox.add("five"));

        System.out.println(stringMagicBox.pick());
        System.out.println(stringMagicBox.pick());
        System.out.println(stringMagicBox.pick());
        System.out.println(stringMagicBox.pick());
    }
}
