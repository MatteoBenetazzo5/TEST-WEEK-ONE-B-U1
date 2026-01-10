package entities;

public abstract class ElementoMultimediale { // abstract dato che in questo caso non esiste un elemento multimediale generico
    // La classe ElementoMultimediale sarà la SUPERCLASSE
    // attributo comune a tutti gli elementi multimediali (video, audio, immagine) è il titolo
    // non ho messo play dato che ad esempio le immagine non possono essere riprodotte
    private String titolo;

    // COSTRUTTORE
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // GETTER
    public String getTitolo() {
        return titolo;
    }
}
