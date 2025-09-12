package Minggu03.SistemInformasiKoperasi;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah) {
        int minimal = (int)(0.1 * jumlahPinjaman);
        if (jumlah < minimal) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}