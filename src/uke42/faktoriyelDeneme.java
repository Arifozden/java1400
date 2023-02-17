package uke42;
import static javax.swing.JOptionPane.*;
public class faktoriyelDeneme {
    public static void faktoriyel(){
        int sayi=Integer.parseInt(showInputDialog("Sayi giriniz"));
        int faktoriyel = 1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        int sayi1=sayi;
        System.out.println("Faktoriyel "+" esittir : "+faktoriyel);
    }
    public static void main(String[] args) {
faktoriyel();
faktoriyel();
faktoriyel();faktoriyel();faktoriyel();

    }
}
