package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_5 {
    public static void main(String[] args) {
        double fahrenheit=Double.parseDouble(showInputDialog("Fahrenheit"));
        double celsius=(fahrenheit-32)/1.8;
        String celsiusMedToDesimaler=String.format("%.2f", celsius);
        System.out.println(celsiusMedToDesimaler);
    }
}
//Oppgave 5
//
//Lag et program som regner om fra fahrenheit til celsius.
// Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel:
// C = (F-32)/1.8. Skriv så ut resultatet i Celsius.