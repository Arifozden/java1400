package uke42;
import static javax.swing.JOptionPane.*;
public class switchDeneme {
    public static void main(String[] args) {
        int sayi1=Integer.parseInt(showInputDialog("Bir sayi girin"));
        switch (sayi1){
            case 1:
                System.out.println("Sayi 1");
                break;
            case 2:
                System.out.println("Sayi 2");
                break;
            case 3:
                System.out.println("Sayi 3");
                break;
            default:
                System.out.println("Gecersiz");
        }
    }
}
