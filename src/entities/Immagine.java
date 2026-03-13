package entities;

import interfaces.Luminosita;
import interfaces.Showable;

public class Immagine extends FileMultimediale implements Showable, Luminosita {

    public final String tipo;
    public int luminosita;

    public Immagine(String nome, int luminosita) {
        super(nome);
        this.tipo = "immagine";
        this.luminosita = luminosita;
    }

    // metodi interfaccia
    @Override
    public void show() {

        StringBuilder lum = new StringBuilder();
        String toShow;

        for (int i = 0; i < luminosita; i++) {
            lum.append('*');
        }

        toShow = nome + " " + lum;
        System.out.println(toShow);
    }

    @Override
    public void alzaLuminosita(int incr) {

        if (incr < 0) {
            System.out.println("Valore non valido");
            return;
        }

        luminosita = Math.min(10, luminosita + incr);

        if (luminosita == 10) System.out.println("luminosità al massimo");
        else System.out.println("Luminosità: " + luminosita);
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
