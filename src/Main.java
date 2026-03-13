import entities.Audio;
import entities.Immagine;
import entities.Video;

public class Main {
    static void main(String[] args) {

        Video pippo = new Video("pippo", 3, 5);
        Audio pluto = new Audio("pluto", 5);
        Immagine minnie = new Immagine("Minnie", 7);
        System.out.println(minnie.show());
    }
}
