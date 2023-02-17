package oppgaveTekrar;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class deneme2_4 {
    public static void main(String[] args) {
        String innTall1=showInputDialog("Skriv et desimaltall");
        String innTall2=showInputDialog("Skriv et desimaltall til");
        String innTall3=showInputDialog("Skriv et desimaltall til");
        double tall1,tall2,tall3;
        try {
            tall1=Double.parseDouble(innTall1);
            tall2=Double.parseDouble(innTall2);
            tall3=Double.parseDouble(innTall3);
        }
        catch (Exception e){
            tall1=0;
            tall2=0;
            tall3=0;

        }



        double sum=tall1+tall2+tall3;
        double gjennomsnitt=sum/3;
        System.out.println("Summen er : "+sum);

        System.out.println(gjennomsnitt);
        showMessageDialog(null, gjennomsnitt);
    }
}
//Oppgave 4 (litt vanskeligere)
//
//Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall og ikke vanlig tekst i input-boksene.
// Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett input til 0.
