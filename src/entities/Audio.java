package entities;

// File importati dalla cartella interfaces, senza importarli non posso dopo fare gli @Override, dato che al loro interno
// ci sono i file con i dati che mi servono

import interfaces.Riproducibile;
import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Riproducibile, Volume {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    // Dentro la cartella interfaces si trova il file "Riproducibile", e dentro si trovano play e getDurata, quindi gli
    // @Override ho deciso di farli rispettando l'ordine di "gerarchia" in modo tale da capirmi meglio. Stessa cosa per
    // il file "Volume" con al suo interno le classi alzaVolume, abbassaVolume e getVolume.
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume)); // questo ti permette di ripetere "!".repeat(volume)
            //per il numero di volte che scegli tu in modo da sembrare un vero volume che si alza e abbassa
        }
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
