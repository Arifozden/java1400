package oppgaveTekrar;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class deneme2_3 {
    public static void main(String[] args) {
        String innTall1=showInputDialog("Skriv et desimaltall");
        String innTall2=showInputDialog("Skriv et desimaltall til");
        String innTall3=showInputDialog("Skriv et desimaltall til");
        double tall1=Double.parseDouble(innTall1);
        double tall2=Double.parseDouble(innTall2);
        double tall3=Double.parseDouble(innTall3);
        double sum=tall1+tall2+tall3;
        double gjennomsnitt=sum/3;
        System.out.println("Summen er : "+sum);

        System.out.println(gjennomsnitt);
        showMessageDialog(null, gjennomsnitt);

    }
}
//Oppgave 3
//
//Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn. Vis så dette resultatet via 1) Meldingsboks og 2) System.out.