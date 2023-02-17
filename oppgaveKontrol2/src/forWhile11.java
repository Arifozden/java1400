import javax.swing.*;

public class forWhile11 {
    public static void main(String[] args) {
        double pris= Double.parseDouble(JOptionPane.showInputDialog("Hvor mye er varen?"));
       //double kommisjon = pris*0.09;
        double berettiget=0;
        double sumKommisjon=0;
        int teller=0;

        while (pris>0){
            double kommisjon = pris*0.09;
            sumKommisjon+=kommisjon;
            berettiget+=sumKommisjon;
            pris= Double.parseDouble(JOptionPane.showInputDialog("Hvor mye er varen?"));
            teller++;
        }
        System.out.println("Sum av kommisjonene : "+sumKommisjon);
        System.out.println(teller);

    }
}
//Oppgave 2
//En salgsperson får kommisjon av salget sitt.
// Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.
// Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
// Bruk inputbokser og avslutt innlesningen når prisen er 0.