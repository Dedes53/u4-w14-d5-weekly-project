package entities;

import interfaces.Playable;

public class Audio extends FileMultimediale implements Playable {

    public final String tipo;
    public int durata;
    public int volume;

    public Audio(String nome, int durata, int volume) {
        super(nome);
        this.tipo = "Audio";
        this.durata = durata;
        this.volume = volume;
    }


    @Override
    public void play() {
        StringBuilder vol = new StringBuilder();
        String toPlay;

        for (int j = 0; j < volume; j++) {
            vol.append('!');
        }

        for (int i = 0; i < durata; i++) {

            toPlay = nome + vol;
            System.out.println(toPlay);
        }
    }
}
