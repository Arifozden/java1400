package uke42;

import javax.swing.*;

public class ifOgren {
    public static void main(String[] args) {
        String girSayi= JOptionPane.showInputDialog("Sayi yaziniz");
        int sayi=Integer.parseInt(girSayi);

        if (sayi<20){
            System.out.println(sayi+", 20 den kucuktur");
        }else if(sayi==20){
            System.out.println(sayi+", 20 ye esittir");

        }else {
            System.out.println(sayi+", 20 den kucuk degildir");
        }
        if (sayi<15){
            System.out.println(sayi+", 15 ten kucuktur");
        }else if (sayi==15){System.out.println(sayi+", 15 e esittir");

        }else {
            System.out.println(sayi+", 15 ten kucuk degildir");
        }
    }

}
