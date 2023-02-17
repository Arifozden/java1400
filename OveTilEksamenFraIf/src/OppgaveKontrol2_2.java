import javax.swing.*;

public class OppgaveKontrol2_2 {
    public static void main(String[] args) {
double pris=Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen på vare. avslutt med 0"));
double totalPris=0;
while (pris>0){
    totalPris += pris;
    pris=Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen på vare. avslutt med 0"));
}

double kommisjon=totalPris*0.09;
        System.out.println(kommisjon);
    }
}
//Oppgave 2
//En salgsperson får kommisjon av salget sitt.
// Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.
// Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
// Bruk inputbokser og avslutt innlesningen når prisen er 0.