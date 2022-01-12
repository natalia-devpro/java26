package lesson13;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(170);
            System.out.println("adfsd");
            System.out.println("ytn");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Все хорошо!!!");

    }
}
