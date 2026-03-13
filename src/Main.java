import entities.Audio;
import entities.Immagine;
import entities.Video;

public class Main {
    static void main(String[] args) {

        Video pippo = new Video("pippo", 4, 3, 5);
        Audio pluto = new Audio("pluto", 3, 5);
        Immagine minnie = new Immagine("Minnie", 3);

        pippo.play();
        pluto.play();
        minnie.show();
    }
}
