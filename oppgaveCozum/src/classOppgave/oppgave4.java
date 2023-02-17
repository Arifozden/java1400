package classOppgave;

import javax.swing.*;

class Per1{
    String navn, adresse, telefonnr;
    int fødselsår;

    public int regneUtAlder(){
        int alder = 2022-fødselsår;
        return alder;
    }
    public void skrivUt(){
        String ut = "Navn : "+navn+"\nAdresse: "+adresse+"\nTelefonnr: "+telefonnr+"\nAlder: "+regneUtAlder()+ "år.";
        JOptionPane.showMessageDialog(null, ut);
    }
}

public class oppgave4 {
    public static void main(String[] args) {
        Per1 p1=new Per1();
        p1.navn=JOptionPane.showInputDialog("Skriv inn navn: ");
        p1.adresse=JOptionPane.showInputDialog("Skriv inn adresse: ");
        p1.telefonnr=JOptionPane.showInputDialog("Skriv inn telefonnr: ");
        p1.fødselsår=Integer.parseInt(JOptionPane.showInputDialog("Skriv inn fødselsår: "));

        p1.skrivUt();
    }
}


//Oppgave 4
//Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:
//
//Navn: Per Hansen
//Adresse : Osloveien 82
//Telefonnr : 22124512
//Alder : 21 år.
//
//Tips: bruk \n for å få ny linje