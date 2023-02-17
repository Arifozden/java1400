package uke42;

import javax.swing.*;

public class switchKullanimi {
    public static void main(String[] args) {
        char not = 'C';
        switch (not) {
            case 'A':
                System.out.println("Mukemmel");
                break;
            case 'B':
                System.out.println("Cok iyi");
                break;
            case 'C':
                System.out.println("Iyi");
                break;
            case 'D':
                System.out.println("Eh");
                break;
            case 'E':
                System.out.println("Biraz daha");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}
