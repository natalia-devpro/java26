package lesson8;

public class Main {
    public static void main(String[] args) {
        Animal slon1 = new Animal(12, "Африканский слон");
        Animal slon2 = new Animal(12, "Африканский слон");
        Object slon3 = slon2;

        System.out.println(slon3.equals(slon1));

        System.out.println(slon2.hashCode());
        System.out.println(slon2.hashCode());
        // 1. Если equals говорит ДА, это не обязаьельно что hashCode их совпадают
        // 2. Если equals говорит ДА,

        System.out.println(slon1.toString());


    }
}
