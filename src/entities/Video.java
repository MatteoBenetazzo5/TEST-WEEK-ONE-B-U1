package entities;

import interfaces.Luminosita;
import interfaces.Riproducibile;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Luminosita, Riproducibile, Volume {

    private int luminosita;
    private int durata;
    private int volume;

    public Video(String titolo, int luminosita, int durata, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
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

    @Override
    public String toString() {
        return "Video{" +
                "luminosita=" + luminosita +
                ", durata=" + durata +
                ", volume=" + volume +
                '}';
    }
}
