package classOppgave;
//Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//
//tittel
//pris
//forfatter
//iSBN-nummer
class Bøker{
    String tittel;
    double pris;
    String forfatter;
    String isbn_nummer;

    public void skriv(){
        System.out.println(tittel);  //Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
        System.out.println(pris);
        System.out.println(forfatter);
        System.out.println(isbn_nummer);

    }
}
public class oppgave1 {
    public static void main(String[] args) {
Bøker b1 = new Bøker();   //Skriv nødvendig kode i main for å opprette et objekt av denne klassen
        b1.tittel="Kitap 1";
        b1.forfatter="OsloMet";
        b1.isbn_nummer="1234321";
        b1.pris=150;

        b1.skriv();          //b1.skriv metod oldugu icin () olmali
    }
}
//Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//
//tittel
//pris
//forfatter
//iSBN-nummer
//Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
//
//Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier. Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.