import javax.swing.*;

public class oppgave2 {
    public static void main(String[] args) {
        int sum=0;
        double kommisjon;
        int vareAntall=1;
        int varePris=Integer.parseInt(JOptionPane.showInputDialog("skri inn prisen til vare "+vareAntall));
        while (varePris!=0){
            vareAntall++;
            sum +=varePris;
            varePris=Integer.parseInt(JOptionPane.showInputDialog("skri inn prisen til vare "+vareAntall));
        }
        kommisjon=sum*0.09;
        JOptionPane.showMessageDialog(null, "tillegg " + kommisjon);

    }
}
//Oppgave 2
//En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.
// Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
// Bruk inputbokser og avslutt innlesningen når prisen er 0.