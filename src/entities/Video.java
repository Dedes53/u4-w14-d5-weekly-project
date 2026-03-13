package entities;

import interfaces.Playable;

public class Video extends FileMultimediale implements Playable {

    public final String tipo;
    public int durata;
    public int volume;
    public int luminosita;

    public Video(String nome, int durata, int volume, int luminosita) {
        super(nome);
        this.tipo = "video";
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }


    //metodi interfaccia
    @Override
    public void play() {
        StringBuilder vol = new StringBuilder();
        StringBuilder lum = new StringBuilder();
        String toPlay;

        for (int j = 0; j < volume; j++) {
            vol.append('!');
        }

        for (int y = 0; y < luminosita; y++) {
            lum.append('*');
        }

        for (int i = 0; i < durata; i++) {

            toPlay = nome + vol + lum;
            System.out.println(toPlay);
        }

    }


}
