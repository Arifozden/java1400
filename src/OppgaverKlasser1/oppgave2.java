package OppgaverKlasser1;

import javax.swing.*;

class Boker1{
    String tittel;
    double pris;
    String forfatter;
    String isbnNummer;

    void skrivUtBok1(){
        String ut="Tittel : "+tittel+" Pris : "+pris+" Forfatter : "+forfatter+" iSBN-nummer : "+isbnNummer;
        JOptionPane.showMessageDialog(null, ut);
    }


}
public class oppgave2 {
    public static void main(String[] args) {
        Boker1 bok1=new Boker1();
        String forfatter=JOptionPane.showInputDialog("Skriv inn forfatter");
        String innPris=JOptionPane.showInputDialog("Skriv inn pris");

        String tittel=JOptionPane.showInputDialog("Skriv inn tittel");
        String isbn=JOptionPane.showInputDialog("Skriv inn ISBN-nummer");
        double pris=Double.parseDouble(innPris);

        bok1.forfatter=forfatter;
        bok1.tittel=tittel;
        bok1.pris= pris;
        bok1.isbnNummer=isbn;

        bok1.skrivUtBok1();

    }
}