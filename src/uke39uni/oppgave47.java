package uke39uni;

import javax.swing.*;

public class oppgave47 {
    public static void main(String[] args) {
        String girPizza= JOptionPane.showInputDialog("Kac pizzaniz var?");
        String girKisi= JOptionPane.showInputDialog("Kac kisisiniz?");
        String girPizzaDilim=JOptionPane.showInputDialog("Bir pizzada kac dilim var?");
        int pizza=Integer.parseInt(girPizza);
        int kisi=Integer.parseInt(girKisi);
        int pizzaDilim=Integer.parseInt(girPizzaDilim);
        int toplamPizzaDilim=pizza*pizzaDilim;
        int kisiBasiDilim=toplamPizzaDilim/kisi;
        int kalanPizzaDilimi=toplamPizzaDilim%kisi;
        System.out.println("Dersom man er "+kisi+" personer og har "+pizza+" pizzaer får hver person "+kisiBasiDilim+" slices og "+kalanPizzaDilimi+" blir til overs.");

    }
}
