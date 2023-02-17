package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_4 {
    public static void main(String[] args) {
        String innRadius=showInputDialog("Skriv radius");
        double radius=Double.parseDouble(innRadius);
        double omkrets=2*3.14*radius;
        String omkretsenMedToDesimaler = String.format("%.2f" , omkrets);
        String ut="Omkretsen av en sirkel med "+radius+" cm som radius blir "+omkretsenMedToDesimaler+" cm.";
        System.out.println(ut);
    }

}

//Oppgave 4
//
//Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
// Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
// ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”