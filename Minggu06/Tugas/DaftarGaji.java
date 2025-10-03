package Minggu06.Tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlahPegawai;

    protected DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
        jumlahPegawai = 0;
    }
    
    protected void addPegawai(Pegawai p) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = p;
            jumlahPegawai++;
        } else {
            System.out.println("Kapasitas daftar gaji penuh.");
        }
    }
    
    protected void printSemuaGaji() {
        System.out.println("--- DAFTAR GAJI PEGAWAI ---");
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama());
            System.out.println("Gaji: Rp" + listPegawai[i].getGaji());
            System.out.println("---------------------------");
        }
    }
}