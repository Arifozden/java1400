package oppgaveTekrar;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class deneme1_2 {
    public static void main(String[] args) {
        String fornavn=showInputDialog("Hva er fornavnet ditt?");
        String etternavn=showInputDialog("Hva er etternavnet ditt?");
        String alder=showInputDialog("Hva er alderen din?");
        showMessageDialog(null, "Alderen til "+fornavn+" "+etternavn+" er "+alder+" år.");
    }
}
   // Utvid oppgave 1 med å lese inn alderen.  Programmet skal så vise følgende i meldingsboksen (f.eks inndata):  ”Alderen til Ole Olsen er 21 år.”