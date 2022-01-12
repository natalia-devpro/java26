package lesson12;

public class Coin {
    private int year;
    private int nominal;
    private double diametr;
    private String metal;

    public Coin() {
    }

    public Coin(int year, int nominal, double diametr, String metal) {
        this.year = year;
        this.nominal = nominal;
        this.diametr = diametr;
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (year != coin.year) return false;
        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diametr, diametr) != 0) return false;
        return metal != null ? metal.equals(coin.metal) : coin.metal == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = year;
        result = 31 * result + nominal;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                ", metal='" + metal + '\'' +
                '}';
    }
}
