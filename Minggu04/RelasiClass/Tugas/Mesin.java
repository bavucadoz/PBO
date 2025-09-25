package Minggu04.RelasiClass.Tugas;

public class Mesin {
    private int kapasitas;
    private String tipeBBM;

    public Mesin(int kapasitas, String bbm) {
        this.kapasitas = kapasitas;
        this.tipeBBM = bbm;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setBBM(String bbm) {
        this.tipeBBM = bbm;
    }

    public String getBBM() {
        return tipeBBM;
    }

    public void tampilkanInfo() {
        System.out.println("Mesin: " + kapasitas + "cc, BBM: " + tipeBBM);
    }
}

