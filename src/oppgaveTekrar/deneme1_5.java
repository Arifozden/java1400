package oppgaveTekrar;

import static javax.swing.JOptionPane.showInputDialog;

public class deneme1_5 {
    public static void main(String[] args) {
        String fornavn=showInputDialog("Hva er fornavnet ditt?");
        String etternavn=showInputDialog("Hva er etternavnet ditt?");
        String alder=showInputDialog("Hva er alderen din?");
        String adresse=showInputDialog("Hva er adresse?");
        String poststed=showInputDialog("Hva er poststed?");
        String postNr=showInputDialog("Hva er postnummer?");
        String ut="Navn :"+fornavn+" "+etternavn+"\n"+"Adresse : "+adresse+"\n"+"Postnummer "+postNr+"\n"+"Poststed :"+poststed+ "\n"+"Alder : "+alder+" år.";
        System.out.println(ut);
    }
}
//Oppgave 5
//
//Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i System.out.