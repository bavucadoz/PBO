package Minggu05;

public class Roket {
    private String Tipe;
    private int Power;

    public Roket (String tipe, int pwr) {
        this.Tipe = tipe;
        this.Power = pwr;
    }

    public void setTipe(String tipe) {
        this.Tipe = tipe;
    }
    public String getTipe() {
        return Tipe;
    }

    public void setPower(int pwr) {
        this.Power = pwr;
    }
    public int getPower() {
        return Power;
    }
}
