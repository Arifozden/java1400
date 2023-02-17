package oppgaveTekrar;

import static javax.swing.JOptionPane.*;
/*Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.

 */
public class deneme1_1 {
    public static void main(String[] args) {
        String fornavn=showInputDialog("Hva er fornavnet ditt?");
        String etternavn=showInputDialog("Hva er etternavnet ditt?");
        showMessageDialog(null, "Jeg heter "+fornavn+" "+etternavn);
    }
}
