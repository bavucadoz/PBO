package Minggu04.RelasiClass.Tugas;

public class Main {
    public static void main(String[] args) {
        Mesin mesin = new Mesin(150, "Pertalite");
        Ban ban = new Ban(17, "Tubeless");

        Pengendara[] pgdr = {
            new Pengendara("Bayu", 12345),
            new Pengendara("Andi", 67890)
        };

        Motor motor = new Motor("Honda", "Merah", mesin, 120, ban, pgdr);
        motor.tampilkanInfo();

        motor.tambahKecepatan(50);
        motor.tampilkanInfo();

        motor.tambahKecepatan(100); 
        motor.tampilkanInfo();

        motor.kurangiKecepatan(200); 
        motor.tampilkanInfo();
    }
}

