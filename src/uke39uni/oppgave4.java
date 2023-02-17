package uke39uni;

import javax.swing.*;

public class oppgave4 {
    public static void main(String[] args) {

        String innTall1 = JOptionPane.showInputDialog("Skriv et desimaltall");
        String innTall2 = JOptionPane.showInputDialog("Skriv et desimaltall til");
        String innTall3 = JOptionPane.showInputDialog("Skriv et desimaltall til");

        double tall1=Double.parseDouble(innTall1);
        double tall2=Double.parseDouble(innTall2);
        double tall3=Double.parseDouble(innTall3);
        double tall4=tall1+tall2+tall3;

        double tall5;
                try{
                    tall5=tall4;
                }
                catch (Exception e){
                    tall5=0;
                    System.out.println(e);
                }
        System.out.println(tall5);
    }
}
