package uke39uni;

import javax.swing.*;

public class arit1 {
    public static void main(String[] args) {
        String inntall1 = JOptionPane.showInputDialog("Skriv in et heltall");
        String inntall2 = JOptionPane.showInputDialog("Skriv in et heltall til");
        double tall1 = Double.parseDouble(inntall1);
        double tall2 = Double.parseDouble(inntall2);
        double resultat1 = tall1+tall2;
        double resultat2 = tall1-tall2;
        double resultat3 = tall1*tall2;
        double resultat4 = tall1/tall2;
        double resultat5 = tall1%tall2;
        double resultat6 = (tall1+tall2)*tall1+tall2;
        System.out.println(resultat1);
        System.out.println(resultat2);
        System.out.println(resultat3);
        System.out.println(resultat4);
        System.out.println(resultat5);
        System.out.println(resultat6);

        int tall3 = 10;
        int tall4 = 4;
        double resultat7;
        resultat7 = (double)tall3/(double)tall4;
        System.out.println(resultat7);

    }
}
