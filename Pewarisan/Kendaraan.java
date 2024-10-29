package Pewarisan;

public class Kendaraan {
    private String merek;
    private String model;
    private int tahunProduksi;

    public Kendaraan(String merek, String model, int tahunProduksil) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksil;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);

    }
}
