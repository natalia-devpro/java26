package lesson9;

public class Journal extends PrintPubl{
    private int number;

    public Journal() {
    }

    public Journal(int number, String name, int yearPubl, String publisher, int pages) {
        super(name, yearPubl, publisher);
        this.number = number;
        this.setPages(pages);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return number == journal.number;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "number=" + number +
                '}';
    }
}
