package uke39uni;

import javax.swing.*;

public class aritDeneme {
    public static void main(String[] args) {
        String girSayi1= JOptionPane.showInputDialog("Bir sayi girin");
        String girSayi2= JOptionPane.showInputDialog("Bir sayi daha girin");

        int sayi1= Integer.parseInt(girSayi1);
        int sayi2= Integer.parseInt(girSayi2);

        double sonuc1 =sayi1/sayi2;
        System.out.println(sonuc1);

        String girSayi3= JOptionPane.showInputDialog("Bir sayi girin");
        String girSayi4= JOptionPane.showInputDialog("Bir sayi daha girin");

        int sayi3= Integer.parseInt(girSayi3);
        int sayi4= Integer.parseInt(girSayi4);

        double sonuc2 =(double) sayi3/(double) sayi4;
        System.out.println(sonuc2);
    }



}
