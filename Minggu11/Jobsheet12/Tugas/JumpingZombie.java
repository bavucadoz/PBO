package Minggu11.Jobsheet12.Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (health * 0.3);
                break;
            case 2:
                health += (health * 0.4);
                break;
            case 3:
                health += (health * 0.5);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data =\n";
        info += super.getZombieInfo();
        return info;
    }
}
