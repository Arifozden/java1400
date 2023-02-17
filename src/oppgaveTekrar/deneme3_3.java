package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_3 {
    public static void main(String[] args) {
        String innlengden=showInputDialog("Skriv lengden");
        String innbredden=showInputDialog("Skriv bredden");
        double lengden=Double.parseDouble(innlengden);
        double bredden=Double.parseDouble(innbredden);
        double areal=lengden*bredden;
        String ut="Et rektangel med bredde "+bredden+" cm og lengde "+lengden+" cm har et areal på "+areal+" cm^2.";
        System.out.println(ut);
    }
}
//Oppgave 3
//
//Lag et program som regner ut arealet av et rektangel.
// Programmet skal lese inn lengden og bredden på rektangelet.
// Regn så ut  arealet og skriver ut svaret på følgende måte:
// ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.