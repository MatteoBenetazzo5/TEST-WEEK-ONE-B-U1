/*        SCHEMA PROGETTO

INTERFACCE (interfaces):
- Riproducibile: play + getDurata
- Volume: alzaVolume, abbassaVolume, getVolume
- Luminosita: aumentaLuminosita, diminuisciLuminosita, getLuminosita

CLASSE ASTRATTA (entities):
- ElementoMultimediale;
- Titolo;

CLASSI CONCRETE (entities):
- Audio extends ElementoMultimediale
  implements Riproducibile, Volume
  - durata, volume;
  - play: stampa titolo + !!!! (volume);

- Video extends ElementoMultimediale
  implements Riproducibile, Volume, Luminosita
  - durata, volume, luminosita;
  - play: stampa titolo + !!!! (volume) + **** (luminosita);

- Immagine extends ElementoMultimediale
  implements Luminosita
  - luminosita;
  - show: stampa titolo + **** (luminosita);

MAIN:
- Creo un array di 5 ElementoMultimediale;
- Riempio l'array leggendo lo Scanner;
- Chiedo un numero da 1-5 per eseguire oppure 0 per uscire;
- Se è Immagine => show
- Se è Riproducibile => play
*/
public class SchemaProgetto {

}