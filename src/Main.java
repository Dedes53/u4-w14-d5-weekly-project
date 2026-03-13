import entities.Audio;
import entities.FileMultimediale;
import entities.Immagine;
import entities.Video;

public class Main {
    static void main(String[] args) {

        Video pippo = new Video("pippo", 4, 3, 5);
        Audio pluto = new Audio("pluto", 3, 5);
        Immagine minnie = new Immagine("Minnie", 3);
        Video paperino = new Video("paperino", 5, 6, 8);
        Audio topolino = new Audio("topolino", 2, 5);

        FileMultimediale[] files = {pippo, pluto, minnie, paperino, topolino};
        

//        pippo.play();
//        pluto.play();
//        minnie.show();
//
//        minnie.abbassaLuminosita(11);
//        minnie.alzaLuminosita(30);
//        minnie.abbassaLuminosita(4);
//        minnie.show();
//
//        pippo.abbassaVolume(23);
//        pippo.alzaVolume(20);
//        pippo.abbassaVolume(3);
//        pippo.play();
    }
}

// dato un array di 5 FileMultimediale l'utente potrà scegliere quale riprodurre (switch dei 6 casi [con 0 esco])
// dentro ai casi dovrò richiamare un metodo che decida per quell'elemento se chiamare play o show.
