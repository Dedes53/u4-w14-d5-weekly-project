package entities;

import interfaces.Luminosita;
import interfaces.Playable;

public class Video extends FileMultimediale implements Playable, Luminosita {

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

    //volume
    @Override
    public void alzaVolume(int incr) {
        if (incr < 0) {
            System.out.println("Valore non valido");
            return;
        }

        volume = Math.min(10, volume + incr);
        if (volume == 10) System.out.println("Volume al massimo");
        else System.out.println("Volume: " + volume);
    }

    @Override
    public void abbassaVolume(int incr) {
        if (incr < 0) {
            System.out.println("Valore non valido");
            return;
        }

        volume = Math.max(0, volume - incr);
        if (volume == 0) System.out.println("Volume al minimo");
        else System.out.println("Volume: " + volume);

    }

    //luminosita
    @Override
    public void alzaLuminosita(int incr) {

        if (incr < 0) {
            System.out.println("Valore non valido");
            return;
        }

        luminosita = Math.min(10, luminosita + incr);

        if (luminosita == 10) System.out.println("luminosità al massimo");
    }

    @Override
    public void abbassaLuminosita(int incr) {
        if (incr < 0) {
            System.out.println("Valore non valido");
            return;
        }

        luminosita = Math.max(0, luminosita - incr);
        if (luminosita == 0) System.out.println("Luminosità al minimo");
        else System.out.println("Luminosità: " + luminosita);

    }
}
