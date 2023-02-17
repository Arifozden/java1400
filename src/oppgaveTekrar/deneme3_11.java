package oppgaveTekrar;

import static javax.swing.JOptionPane.*;

public class deneme3_11 {
    public static void main(String[] args) {
        int tall1, tall2, tall3, tall4, tall5, tall6;
        tall1 = Integer.parseInt(showInputDialog("Skriv et tall mellom 0 og 1000"));
        tall2 = tall1 / 10;
        tall3 = tall1 % 10;
        tall4 = tall2 / 10;
        tall5 = tall2 % 10;
        tall6 = tall4 % 10;
        System.out.println(tall3 + tall5 + tall6);


    }
}
//Oppgave 11 (litt vanskeligere)
//
//Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen).
// F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.