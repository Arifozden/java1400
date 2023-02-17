package oppgaveTekrar;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class deneme1_4 {
    public static void main(String[] args) {
        String fornavn=showInputDialog("Hva er fornavnet ditt?");
        String etternavn=showInputDialog("Hva er etternavnet ditt?");
        String alder=showInputDialog("Hva er alderen din?");
        String adresse=showInputDialog("Hva er adresse?");
        String poststed=showInputDialog("Hva er poststed?");
        String postNr=showInputDialog("Hva er postnummer?");
        String ut="Navn :"+fornavn+"\n"+"Adresse : "+adresse+"\n"+"Postnummer "+postNr+"\n"+"Poststed :"+poststed+ "\n"+"Alder : "+alder+" år.";
        showMessageDialog(null, ut);
    }
}

//Oppgave 4
//
//Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):
//
//Navn : Ole Olsen
//Adresse : Osloveien 23
//Postnummer : 0470
//Poststed : Oslo
//Alder : 21 år.
//
//Tips: bruk \n for å få ny linje