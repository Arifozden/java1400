import javax.swing.*;

class Bøker{
    String tittel;
    double pris;
    String forfatter;
    String iSBN;

    void skrivUt(){
        System.out.println("Tittelen er "+tittel);
        System.out.println("Prisen er "+ pris);
        System.out.println("Forfatteren er "+forfatter);
        System.out.println("ISBN-nummer er "+iSBN);
    }

}

public class OppgaveClass1_1 {
    public static void main(String[] args) {
        Bøker bok1=new Bøker();
        bok1.tittel= "Hero";
        bok1.pris=100;
        bok1.forfatter="Meg";
        bok1.iSBN="12345";
        bok1.skrivUt();
    }
}
//Oppgave 1
//Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//
//tittel
//pris
//forfatter
//iSBN-nummer
//Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
//
//Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
// Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.