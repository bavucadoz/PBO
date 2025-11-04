package Minggu11.Latihan;

public class Manusia {
    public void MakanBuah (Buah x) {
        if (x instanceof Apel) {
            System.out.println("Apel langsung dimakan");
            ((Apel)x).TampilkanBiji();
        } else if (x instanceof Pisang) {
            System.out.println("Pisang dikupas terlebih dahulu");
            ((Pisang)x).TampilkanKulit();
        } else if (x instanceof Durian) {
            System.out.println("Durian dibelah terlebih dahulu");
        }

        System.out.println("Rasanya " + x.Rasa);
        System.out.println("Kandungan airnya " + x.Air);
    }
}
