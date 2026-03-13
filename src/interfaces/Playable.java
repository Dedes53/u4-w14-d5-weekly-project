package interfaces;

public interface Playable {
    public void play();

    // solo un Playable può modificare il volume
    public void alzaVolume(int vol);

    public void abbassaVolume(int vol);
}
