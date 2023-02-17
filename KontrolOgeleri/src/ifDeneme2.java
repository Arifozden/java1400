import javax.swing.*;

public class ifDeneme2 {
    public static void main(String[] args) {
        int sayi1=Integer.parseInt(JOptionPane.showInputDialog("birinci sayiyi giriniz"));
        int sayi2=Integer.parseInt(JOptionPane.showInputDialog("ikinci sayiyi giriniz"));
        if(sayi1==sayi2){
            System.out.println(sayi1 +" esittir "+sayi2);
        }else if (sayi1<sayi2){
            System.out.println(sayi1+" kucuktur "+sayi2);
        }else {
            System.out.println(sayi1+" buyuktur "+sayi2);
        }
    }
}
