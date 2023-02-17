package uke39uni;

import javax.swing.*;

public class avviksHandtering {
    public static void main(String[] args) {
        String innString = JOptionPane.showInputDialog("Skriv en heltall");
        int Tall;
        try{
            Tall=Integer.parseInt(innString);
        }
        catch (Exception e){
            Tall = 0;
            System.out.println(e);
        }

        System.out.println(Tall);
    }
}
