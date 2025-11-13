package Minggu11.Jobsheet12.Tugas;

public class Plant {
    public void doDestroy(Destroyable d) {
        if (d instanceof Zombie) {
            ((Zombie) d).destroyed();
        } else if (d instanceof Barrier) {
            ((Barrier) d).destroyed();
        }
    }
}
