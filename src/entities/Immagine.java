package entities;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    // Non ho messo @Override come negli altri dato che è un metodo nuovo e non sta sovrascrivendo niente
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
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
    public String toString() {
        return "Immagine{" +
                "luminosita=" + luminosita +
                '}';
    }
}
