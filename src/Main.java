import entities.Audio;
import entities.FileMultimediale;
import entities.Immagine;
import entities.Video;
import interfaces.Playable;
import interfaces.Showable;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Video pippo = new Video("pippo", 4, 3, 5);
        Audio pluto = new Audio("pluto", 3, 5);
        Immagine minnie = new Immagine("Minnie", 3);
        Video paperino = new Video("paperino", 5, 6, 8);
        Audio topolino = new Audio("topolino", 2, 5);

        FileMultimediale[] files = {pippo, pluto, minnie, paperino, topolino};

        boolean isPlaying = true;

        System.out.println("Nel tuo Player Multimediale hai: " + files.length + "." +
                "\nDigita da 1 a 5 per scegliere quale file aprire, 0 per uscire.");

        String prossimoFile = "Se vuoi riprodurre un altro file selezionalo da 1 a 5, se vuoi chiudere il player digita 0";

        while (isPlaying) {

            int file = scanner.nextInt();

            switch (file) {
                case 0:
                    isPlaying = false;
                    System.out.println("Player multimediale in spegnimento...");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    riproduciFile(files[file - 1]);
                    System.out.println(prossimoFile);
                    break;
//                case 1:
//                    riproduciFile(files[file - 1]);
//                    System.out.println(prossimoFile);
//                    break;
//                case 2:
//                    riproduciFile(files[file - 1]);
//                    System.out.println(prossimoFile);
//                    break;
//                case 3:
//                    riproduciFile(files[file - 1]);
//                    System.out.println(prossimoFile);
//                    break;
//                case 4:
//                    riproduciFile(files[file - 1]);
//                    System.out.println(prossimoFile);
//                    break;
//                case 5:
//                    riproduciFile(files[file - 1]);
//                    System.out.println(prossimoFile);
//                    break;
                default:
                    System.out.println("Il file selezionato non esiste, seleziona uno dei file in memoria");
            }


        }
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

    //metodo per selezionare come riprodurre.
    static void riproduciFile(FileMultimediale file) {

        if (file instanceof Playable playable) {
            playable.play();
            return;
        }

        if (file instanceof Showable showable) {
            showable.show();
            return;
        }

        System.out.println("Tipo di file non supportato");

    }


}

// dato un array di 5 FileMultimediale l'utente potrà scegliere quale riprodurre (switch dei 6 casi [con 0 esco])
// dentro ai casi dovrò richiamare un metodo che decida per quell'elemento se chiamare play o show.
