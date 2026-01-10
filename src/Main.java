import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;
import interfaces.Riproducibile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array che contiene TUTTI gli elementi multimediali che si vogliono riprodurre, in questo caso 5 per
        // via della consegna ma volendo se ne possono mettere anche all'infinito.
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        //                    CREAZIONE 5 ELEMENTI
        for (int i = 0; i < elementi.length; i++) {
            System.out.println((i + 1) + " " + "QUALE ELEMENTO MULTIMEDIALE VUOI RIPRODURRE? ");
            System.out.println("1-Audio  2-Video  3-Immagine");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            // Questa è l'unica caratteristica comune a tutti gli elementi multimediali
            System.out.print("Inserisci titolo: ");
            String titolo = scanner.nextLine();

            // Queste sono le informazioni che Audio deve possedere
            if (scelta == 1) {
                System.out.print("Inserisci Durata: ");
                int durata = scanner.nextInt();
                System.out.print("Inserisci Volume: ");
                int volume = scanner.nextInt();

                elementi[i] = new Audio(titolo, durata, volume);

                // Queste sono le informazioni che Video deve possedere
            } else if (scelta == 2) {
                System.out.print("Inserisci Durata: ");
                int durata = scanner.nextInt();
                System.out.print("Inserisci Volume: ");
                int volume = scanner.nextInt();
                System.out.print("Inserisci Luminosità: ");
                int luminosita = scanner.nextInt();

                elementi[i] = new Video(titolo, durata, volume, luminosita);

                // Queste sono le informazioni che Immagine deve possedere
            } else if (scelta == 3) {
                System.out.print("Inserisci Luminosità: ");
                int luminosita = scanner.nextInt();

                elementi[i] = new Immagine(titolo, luminosita);
            }
        }


        //                    ESECUZIONE ELEMENTI
        int comando; // variabile che userò per sapere cosa vuole fare l’utente

        do {
            System.out.println(" ");
            System.out.println("SONO STATI INSERITI 5 ELEMENTI, ORA SCEGLI TRA LE 2 OPZIONI:");
            System.out.println("1) Inserisci un numero da 1 a 5 per eseguire un elemento");
            System.out.println("2) Inserisci 0 per uscire");

            // leggo il numero inserito dall'utente
            comando = scanner.nextInt();

            // controllo che il numero sia valido (da 1 a 5)
            if (comando >= 1 && comando <= 5) {

                // prendo dall'array l'elemento scelto
                ElementoMultimediale elemento = elementi[comando - 1];

                // se l'elemento è un'Immagine chiamo show()
                // uso instanceof per controllare il tipo reale dell'oggetto
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();

                    // altrimenti, se è un elemento riproducibile (Audio o Video)
                } else if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                }
            }

            // il ciclo continua finché l'utente non inserisce 0
        } while (comando != 0);

        scanner.close();
    }
}

