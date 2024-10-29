package Polimorfisme;

public class Persegi {
    public String sisi;

    public Persegi(String sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
