package Minggu08;

public class PatrolRobot extends Robot {
    public Battery RobotBattery;

    public PatrolRobot (String Name, int CPUSpeed, int Power, Battery battery) {
        super.Name = "PATROL " + Name;
        super.CPUSpeed = CPUSpeed;
        super.Power = Power;
        this.RobotBattery = battery;
    }

    public void increasePower() {
        Power = Power + 20;
    }
}
