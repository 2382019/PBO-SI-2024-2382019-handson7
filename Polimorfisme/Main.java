package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        bangunDatar = new Persegi(4);
        System.out.println("Luas Persegi : " + bangunDatar.luas());
        System.out.println("Keliling Persegi : " + bangunDatar.keliling());
    }
}
