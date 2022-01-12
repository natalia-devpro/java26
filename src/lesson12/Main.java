package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        numbers.add(0, 111);
        numbers.set(0, 222);
        numbers.remove(0);

        System.out.println(numbers);

        // byte --- Byte
        // int --- Integer
        // char --- Character

    }
}
