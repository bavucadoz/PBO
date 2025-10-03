package Minggu06.Tugas;

public class Pegawai {
    public String nip; 
    public String nama;
    public String alamat;
    
    protected Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    protected String getNama() {
        return nama;
    }
    
    // Gaji dasar
    protected int getGaji() {
        return 2000000; 
    }
}