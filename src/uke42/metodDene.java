package uke42;
import static javax.swing.JOptionPane.*;
public class metodDene {
    public static void topla(int a, int b, int c){

        System.out.println("Toplamlari : "+(a+b+c));
    }

    public static void main(String[] args) {
        topla(Integer.parseInt(showInputDialog("ilk sayi gir")),Integer.parseInt(showInputDialog("2. sayi gir")),Integer.parseInt(showInputDialog("3. sayi gir")));


        //String a="564";
        //int c =Integer.valueOf(a)
    }
}
