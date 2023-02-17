package uke42;

import javax.swing.*;

public class metodDeneme {
    public static void selam(String isim) {
        System.out.println("Selam "+isim);


    }

    public static void main(String[] args) {
        selam(JOptionPane.showInputDialog("isminiz"));
        selam(JOptionPane.showInputDialog("isminiz"));
        selam(JOptionPane.showInputDialog("isminiz"));

    }
}

