package Minggu06.Tugas;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS = 50000; 
    
    protected Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat); 
    }
    
    protected void setSKS(int sks) {
        this.jumlahSKS = sks;
    }
    
    // Override method getGaji()
    @Override
    protected int getGaji() {
        return super.getGaji() + (jumlahSKS * TARIF_SKS);
    }
}
