package eger;
import javax.swing.JOptionPane;
public class ifDeneme {
    public static void main(String[] args) {
        String girSayi1 = JOptionPane.showInputDialog("ilk sayiyi girin");
        String girSayi2 = JOptionPane.showInputDialog("ikinci sayiyi girin");

        int sayi1 = Integer.parseInt(girSayi1);
        int sayi2 = Integer.parseInt(girSayi2);

        if (sayi1 == sayi2){
            JOptionPane.showMessageDialog(null, "Sayi1 ve sayi2 esittir.");
        }

        if (sayi1 != sayi2){
            JOptionPane.showMessageDialog(null, "Sayi1 ve sayi2 esit degildir.");
        }

        if (sayi1 < sayi2){
            JOptionPane.showMessageDialog(null, "Sayi1, sayi2 den kucuktur.");
        }

        if (sayi1>sayi2){
            JOptionPane.showMessageDialog(null, "Sayi1, sayi2 den buyuktur.");
        }

        if (sayi1<=sayi2){
            JOptionPane.showMessageDialog(null, "Sayi1 sayi2 ye esittir ya da kucuktur.");
        }

        if (sayi1>=sayi2){
            JOptionPane.showMessageDialog(null, "Sayi1 sayi2 den buyuktur ya da esittir.");
        }

    }
}
