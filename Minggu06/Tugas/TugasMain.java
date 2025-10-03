package Minggu06.Tugas;

public class TugasMain {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5);

        Dosen d1 = new Dosen("12345", "Miyawaki Sakura", "Jepang");
        d1.setSKS(4); 
        Dosen d2 = new Dosen("67890", "Jang Wonyoung", "Korea");
        d2.setSKS(8); 
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);
        daftar.printSemuaGaji();
    }
}
