package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_7 {
    public static void main(String[] args) {

        int antallPizza = Integer.parseInt(showInputDialog("Hvor mange pizza har dere?"));
        int antallPersoner = Integer.parseInt(showInputDialog("Hvor mange personer er der?"));
        int antallSlicesPerPizza =Integer.parseInt(showInputDialog("Hvor mange slices per pizza"));

        int antallPerPerson =( antallSlicesPerPizza * antallPizza) / antallPersoner;
        int oversPizza = antallSlicesPerPizza % antallPersoner;

        String ut="Dersom man er "+antallPersoner+" personer og har "+antallPizza+" pizzaer får hver person "+antallPerPerson+ " slices og "+oversPizza+ " blir til overs.";
        System.out.println(ut);

    }
}
//Oppgave 7
//
//Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
// Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
// Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren. Skriv ut resultatet på følgende form:
// ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.
