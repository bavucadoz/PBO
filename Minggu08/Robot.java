package Minggu08;

public class Robot {
    public String Name;
    public int CPUSpeed;
    public int Power;

    public void increasePower() {
        Power = Power + 10;
        System.out.println("Power = " + Power);
    }

    public void reducePower() {
        Power = Power - 10;
        System.out.println("Power = " + Power);
    }
}
