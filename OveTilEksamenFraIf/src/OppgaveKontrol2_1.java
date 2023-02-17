import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveKontrol2_1 {
    public static void main(String[] args) {

        double lengdenPåTuren=Double.parseDouble(JOptionPane.showInputDialog("Skriv lengden på turen i km. Skriv 0 til å slutte."));
        double bruktBensin=Double.parseDouble(JOptionPane.showInputDialog("Hvor mye bensin ble brukt på turen?"));
        double totalLengden=0;
        double totalBensin=0;
        while (lengdenPåTuren>0){
            totalLengden = totalLengden+ lengdenPåTuren;
            totalBensin = totalBensin+bruktBensin;
            lengdenPåTuren=Double.parseDouble(JOptionPane.showInputDialog("Skriv lengden på turen i km. Skriv 0 til å slutte."));
            bruktBensin=Double.parseDouble(JOptionPane.showInputDialog("Hvor mye bensin ble brukt på turen?"));
            }
        double bensinPerKm=totalBensin/ totalLengden*10;

        System.out.println("Bilen har brukt "+bensinPerKm+ " liter bensin per mil");

/*
        double antallKM = Double.parseDouble(showInputDialog("Skriv inn antall km på denne turen, avslutt med 0"));
        double antallLiter = Double.parseDouble(showInputDialog("Skriv inn antall liter som ble brukt på turen:"));
        double totaltAntallKM = 0, totaltAntallLiter = 0;
        while (antallKM>0){
            totaltAntallKM += antallKM;
            totaltAntallLiter += antallLiter;
            antallKM = Double.parseDouble(showInputDialog("Skriv inn antall km på denne turen, avslutt med 0"));
            antallLiter = Double.parseDouble(showInputDialog("Skriv inn antall liter som ble brukt på turen:"));
        }
        double gjennomsnitt = totaltAntallLiter / totaltAntallKM * 10;
        showMessageDialog(null, "Gjennomsnittelig forbruk pr mil er "+gjennomsnitt+" liter");*/
    }
}
//Oppgave 1
//Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
// Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt.
// Les inn ved hjelp av inputbokser (JOptionPane).
// Når lengden på turen er 0 eller negativ avsluttes innlesningen og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.