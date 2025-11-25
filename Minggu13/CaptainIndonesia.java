package Minggu13;

public class CaptainIndonesia extends Hero {
    public int level;

    public CaptainIndonesia (String nama, int level) {
        super.nama = nama;
    }

    public void serang (KillAble ka) {
        if (ka instanceof Evil) {
            ((Evil) ka).dead();
            System.out.println(" telah diserang! Oleh " + super.nama);
        } else if (ka instanceof Villain) {
            ((Villain) ka).dead();
            System.out.println(" telah diserang! Oleh " + super.nama);
        };
    }
}
