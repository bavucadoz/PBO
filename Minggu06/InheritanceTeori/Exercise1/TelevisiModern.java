package Minggu06.InheritanceTeori.Exercise1;

public class TelevisiModern extends Televisi {
    private String modusTampilan;
    private String dvd;

    public TelevisiModern(String mrk, int jmlChannel) {
        this.merek = mrk;
        this.jumlahChannel = jmlChannel;
        this.dvd = "kosong";
    }

    public void gantiModusTampilan(String modus) {
        this.modusTampilan = modus;
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }

    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
    }
}
