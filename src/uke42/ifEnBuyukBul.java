package uke42;

import javax.swing.*;

public class ifEnBuyukBul {
    public static void main(String[] args) {
        String girSayi1 = JOptionPane.showInputDialog("sayi 1 i gir");
        String girSayi2 = JOptionPane.showInputDialog("sayi 2 yi gir");
        String girSayi3 = JOptionPane.showInputDialog("sayi 3 u gir");

        int sayi1 = Integer.parseInt(girSayi1);
        int sayi2 = Integer.parseInt(girSayi2);
        int sayi3 = Integer.parseInt(girSayi3);
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En buyuk : "+enBuyuk);
    }
}
