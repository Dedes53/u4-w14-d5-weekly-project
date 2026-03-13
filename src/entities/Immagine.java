package entities;

import interfaces.Showable;

public class Immagine extends FileMultimediale implements Showable {

    public final String tipo;
    public int luminosita;

    public Immagine(String nome, int luminosita) {
        super(nome);
        this.tipo = "immagine";
        this.luminosita = luminosita;
    }

    // metodo interfaccia
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
}
