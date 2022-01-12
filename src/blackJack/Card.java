package blackJack;

public class Card implements ICard {
    //поля класса
    private String name;
    private int value;
//создаем конструктор

    public Card() {
    }

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }
    //генерируем геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    //делаем принт консоль, чтобы вывести имя карты
    public void open(){
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        return name != null ? name.equals(card.name) : card.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
