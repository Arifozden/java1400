package uke39uni;

import javax.swing.*;

public class oppgave46 {
    public static void main(String[] args) {
        String girDolar= JOptionPane.showInputDialog("Kac dolariniz var?");
        int dolar=Integer.parseInt(girDolar);
        double kron=dolar*10.91;
        System.out.println("Tebrikler! "+kron+" kronunuz var.");
    }
}
