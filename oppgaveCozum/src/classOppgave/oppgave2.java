package classOppgave;

import javax.swing.*;

class Bøker2 {
    String tittel;
    double pris;
    String forfatter;
    String isbn_nummer;

    public void okuYaz() {
        tittel = JOptionPane.showInputDialog("Skriv tittel");
        pris = Double.parseDouble(JOptionPane.showInputDialog("Skriv pris"));
        forfatter = JOptionPane.showInputDialog("Skriv forfatter");
        isbn_nummer = JOptionPane.showInputDialog("Skriv isbn");
        JOptionPane.showMessageDialog(null, tittel + "\n" + pris + "\n" + forfatter + "\n" + isbn_nummer);
    }
}
    public class oppgave2 {
        public static void main(String[] args) {
            Bøker2 b2 = new Bøker2();
            b2.okuYaz();

    }
}

//Oppgave 2
//Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.