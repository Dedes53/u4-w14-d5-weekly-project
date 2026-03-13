package entities;

public class Video extends FileMultimediale {

    public final String tipo;
    public int volume;
    public int luminosita;

    public Video(String nome, int volume, int luminosita) {
        super(nome);
        this.tipo = "video";
        this.volume = volume;
        this.luminosita = luminosita;
    }


}
