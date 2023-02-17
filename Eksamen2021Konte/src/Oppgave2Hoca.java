import javax.swing.*;

public class Oppgave2Hoca {
    public static void main(String[] args) {
        double vekt,hoyde;
        String innVekt=JOptionPane.showInputDialog("Skriv inn vekten");
        String innHoyde=JOptionPane.showInputDialog("Skriv inn høyden");
        try {
            vekt=Double.parseDouble(innVekt);
            hoyde=Double.parseDouble(innHoyde);
        }catch (Exception e){
            vekt=0;
            hoyde=0;
        }
        if(vekt==0||hoyde==0){
            JOptionPane.showMessageDialog(null,"Går ut av programmet, ikke gyldig input");
        }else {
            double BMI=(1.3*vekt)/(Math.pow(hoyde/100,2.5));
            JOptionPane.showMessageDialog(null,"BMI er "+String.format("%.2f",BMI));
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