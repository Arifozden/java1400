import javax.swing.*;
public class Oppgave2 {
    public static void main(String[] args) {
        try {
            int vekt = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn vekt"));
            int hoyde = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn høyde"));
            double dHoyde = (double) hoyde / 100;
            double BMI = (1.3 * vekt) / Math.pow(dHoyde, 2.5);
            JOptionPane.showMessageDialog(null,"BMI er "+BMI);
        }catch (Exception e){
            System.out.println("feil skrevet");
        }
    }
}
//Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes input-
//dialogbokser og meldingsboks fra Swing-bibliotektet.
//
//Først skal det leses inn vekten (i kg) og deretter høyden (i cm).
//
//Så skal BMI'en regnes ut med følgende formel:
//( 1,3 * vekt) / ( høyde/100)^ 2,5 )
//^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntalllet og b eksponenten.
//
//Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
//
//Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
//isteden for beregningen.