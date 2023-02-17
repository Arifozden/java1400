package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme2_2 {
    public static void main(String[] args) {
        String innTall1=showInputDialog("Skriv et desimaltall");
        String innTall2=showInputDialog("Skriv et desimaltall til");
        String innTall3=showInputDialog("Skriv et desimaltall til");
        double tall1=Double.parseDouble(innTall1);
        double tall2=Double.parseDouble(innTall2);
        double tall3=Double.parseDouble(innTall3);

        System.out.println("Summen er : "+tall1+tall2+tall3);

    }
}
//Oppgave 2
//
//Lag et program som leser inn tre desimaltall. Programmet skal så summere disse tallene og vise summen i System.out.