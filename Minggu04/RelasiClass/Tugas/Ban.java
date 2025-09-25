package Minggu04.RelasiClass.Tugas;

public class Ban {
    private int ukuran;
    private String jenisBan;

    public Ban(int ukuran, String jenisBan) {
        this.ukuran = ukuran;
        this.jenisBan = jenisBan;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setBan(String ban) {
        this.jenisBan = ban;
    }

    public String getBan() {
        return jenisBan;
    }

    public void tampilkanInfo() {
        System.out.println("Ban: ukuran " + ukuran + " inch, jenis " + jenisBan);
    }
}

