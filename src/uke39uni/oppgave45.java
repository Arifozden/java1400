package uke39uni;

import javax.swing.*;

public class oppgave45 {
    public static void main(String[] args) {
        String girFah= JOptionPane.showInputDialog("Hava sicakligini fahrenheit olarak yaziniz");
        int fah=Integer.parseInt(girFah);
        double cel= (double) ((fah-32)/1.8);
        String cel2ondalikli=String.format("%.2f",cel);
        System.out.println(cel2ondalikli);
    }
}
