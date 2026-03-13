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


    //metodi interfaccia
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


}
