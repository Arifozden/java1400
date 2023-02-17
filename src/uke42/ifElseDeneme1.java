package uke42;
import static javax.swing.JOptionPane.*;
public class ifElseDeneme1 {
    public static void main(String[] args) {
        int A=Integer.parseInt(showInputDialog("Bir sayi yaz"));
        int B=Integer.parseInt(showInputDialog("Bir sayi daha yaz"));
        if(A==B){
            System.out.println(A+" ve "+B+" esit");
        }
        else if(A<B){
            System.out.println(A+", "+B+" den kucuktur");
        }
        else {
            System.out.println(A+", "+B+" den buyuktur");
        }
    }
}
