package Minggu11.Jobsheet12.Tugas;

public class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    } 
    public int getStrength() {
        return strength;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}