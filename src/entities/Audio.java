package entities;

public class Audio extends FileMultimediale {

    public final String tipo;
    public int volume;

    public Audio(String nome, int volume) {
        super(nome);
        this.tipo = "Audio";
        this.volume = volume;
    }


}
