package oppgaveTekrar;

import static javax.swing.JOptionPane.showInputDialog;

public class deneme1_3 {
    public static void main(String[] args) {
        String fornavn=showInputDialog("Hva er fornavnet ditt?");
        String etternavn=showInputDialog("Hva er etternavnet ditt?");
        String alder=showInputDialog("Hva er alderen din?");
        String adresse=showInputDialog("Hva er adresse?");
        String poststed=showInputDialog("Hva er poststed?");
        String postNr=showInputDialog("Hva er postnummer?");
        System.out.println(fornavn+" "+etternavn+" bor i "+adresse+" som har postnummer "+postNr+" i "+poststed+". "+fornavn+" ’s alder er "+alder+" år.");
    }
}
//Utvid oppgave 2 med adresse, poststed og postnr. Les inn dataene i flere inputbox'er og skriv det ut i en setning f.eks :
// Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Ole’s alder er 21 år.