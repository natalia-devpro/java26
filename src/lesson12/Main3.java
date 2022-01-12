package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        HashSet<Integer> b = new HashSet<>();
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> union =  utils.union(a, b);
        System.out.println(union);
    }
}
