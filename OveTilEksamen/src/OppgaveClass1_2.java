import javax.swing.*;

class Bøker1{
    String tittel;
    double pris;
    String forfatter;
    String iSBN;

    void skrivUt(){
        String ut="Tittelen er "+tittel+"\n Prisen er "+ pris+"\n Forfatteren er "+forfatter+"\nISBN-nummer er "+iSBN;
        JOptionPane.showMessageDialog(null,ut);
    }

}
public class OppgaveClass1_2 {
    public static void main(String[] args) {
        Bøker1 bok1=new Bøker1();
        bok1.tittel= JOptionPane.showInputDialog("Skriv inn tittelen");
        bok1.pris=Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen"));
        bok1.forfatter=JOptionPane.showInputDialog("Skriv inn forfatteren");
        bok1.iSBN=JOptionPane.showInputDialog("Skriv inn ISBN-nummeret");
        bok1.skrivUt();
    }

}

//
//Oppgave 2
//Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.

//Oppgave 1
//Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//
//tittel
//pris
//forfatter
//iSBN-nummer
//Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
//
//Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier. Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
