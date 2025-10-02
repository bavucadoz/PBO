package Minggu06.InheritanceTeori.Exercise1;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi() {
        this.merek = "";
        this.jumlahChannel = 0;
        this.channelAktif = 1;
    }

    public void pindahChannel(int channelBaru) {
        if (channelBaru >= 1 && channelBaru <= jumlahChannel) {
            channelAktif = channelBaru;
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
