package uke42;

import static javax.swing.JOptionPane.*;

public class ifHesapMakinesi {
    public static void main(String[] args) {
        int sayi1 = Integer.parseInt(showInputDialog("Bir tam sayi giriniz"));
        int sayi2 = Integer.parseInt(showInputDialog("Bir tam sayi daha girin"));
        int secim = Integer.parseInt(showInputDialog("Hangi islemi yapacaginizi secin : \n1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme"));

        if (secim == 1) {
            System.out.println(sayi1 + sayi2);
        } else if (secim == 2) {
            System.out.println(sayi1 - sayi2);

        } else if (secim == 3) {
            System.out.println(sayi1 * sayi2);
        } else if (secim==4) {
            if (sayi2==0){
                System.out.println("0 a bolum tanimsizdir");
            }else {
                System.out.println(sayi1 / sayi2);
            }

        }
        else {
            System.out.println("Gecersiz giris");
        }
    }
}
