package Minggu04.RelasiClass.Tugas;

public class Motor {
    private String merek;
    private String warna;
    private Mesin mesin;
    private int maxSpeed;
    private Ban ban;
    private Pengendara[] pgdr;
    private int currentSpeed;      // kecepatan saat ini

    public Motor(String merek, String warna, Mesin mesin, int maxSpeed, Ban ban, Pengendara[] pgdr) {
        this.merek = merek;
        this.warna = warna;
        this.mesin = mesin;
        this.maxSpeed = maxSpeed;
        this.ban = ban;
        this.pgdr = pgdr;
        this.currentSpeed = 0; 
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    public Ban getBan() {
        return ban;
    }

    public void setPgdr(Pengendara[] pgdr) {
        this.pgdr = pgdr;
    }

    public Pengendara[] getPgdr() {
        return pgdr;
    }

    public void tambahKecepatan(int tambahan) {
        if (currentSpeed + tambahan > maxSpeed) {
            currentSpeed = maxSpeed;
            System.out.println("Motor sudah mencapai kecepatan maksimum: " + currentSpeed + " km/h");
        } else {
            currentSpeed += tambahan;
            System.out.println("Kecepatan bertambah, sekarang: " + currentSpeed + " km/h");
        }
    }

    public void kurangiKecepatan(int pengurangan) {
        if (currentSpeed - pengurangan < 0) {
            currentSpeed = 0;
            System.out.println("Motor berhenti. Kecepatan: 0 km/h");
        } else {
            currentSpeed -= pengurangan;
            System.out.println("Kecepatan berkurang, sekarang: " + currentSpeed + " km/h");
        }
    }

    public void tampilkanInfo() {
        System.out.println("=== Info Motor ===");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Maksimal Kecepatan: " + maxSpeed + " km/h");
        System.out.println("Kecepatan saat ini: " + currentSpeed + " km/h");
        mesin.tampilkanInfo();
        ban.tampilkanInfo();
        System.out.println("Daftar Pengendara:");
        for (Pengendara p : pgdr) {
            p.tampilkanInfo();
        }
        System.out.println("==================\n");
    }
}

