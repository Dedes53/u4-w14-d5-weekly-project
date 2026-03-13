package entities;

public abstract class FileMultimediale {

    //attributi
    public final String nome;


    //costruttori
    public FileMultimediale(String nome) {
        this.nome = nome;
    }

    //getters
    public String getNome() {
        return this.nome;
    }
    

}
