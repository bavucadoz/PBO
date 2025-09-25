package Minggu04.RelasiClass.Tugas;

public class Pengendara {
    private String nama;
    private int noSIM;

    public Pengendara(String nama, int sim) {
        this.nama = nama;
        this.noSIM = sim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSIM(int sim) {
        this.noSIM = sim;
    }

    public int getSIM() {
        return noSIM;
    }

    public void tampilkanInfo() {
        System.out.println("Pengendara: " + nama + " | SIM: " + noSIM);
    }
}

