package uke39uni;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        String alder = JOptionPane.showInputDialog("Skriv inn din alder");
        int alderTall = Integer.parseInt(alder);
        JOptionPane.showMessageDialog(null, "Min alder er "+alderTall);

    }
}
