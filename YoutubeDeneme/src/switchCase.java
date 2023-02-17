import javax.swing.*;

public class switchCase {
    public static void main(String[] args) {
        //int sayi=Integer.parseInt(JOptionPane.showInputDialog("Sayi gir"));
        int bakiye=1000;
        int islem;

        /*System.out.println("1 : Bakiye goruntule");
        System.out.println("2 : Para yatirma");
        System.out.println("3 : Para cekme");
        System.out.println("4 : Sistemden cikis");*/

        islem = Integer.parseInt(JOptionPane.showInputDialog("Islem seciniz:\n" +
                "1 : Bakiye goruntule\n" +
                "2 : Para yatirma\n" +
                "3 : Para cekme\n" +
                "4 : Sistemden cikis"));

        switch (islem){
            case 1:
                JOptionPane.showMessageDialog(null, "Bakiyeniz : "+bakiye+ " tl dir.");
                //System.out.println("Bakiyeniz : "+bakiye+ " tl dir.");
                break;
            case 2:
                int yatirilanMiktar=Integer.parseInt(JOptionPane.showInputDialog("Ne kadar para yatiracaksiniz?"));
                JOptionPane.showMessageDialog(null,"Yeni bakiye : "+(bakiye+yatirilanMiktar));
                break;
            case 3:
                int cekilenMiktar=Integer.parseInt(JOptionPane.showInputDialog("Ne kadar para cekeceksiniz?"));
                JOptionPane.showMessageDialog(null, "Yeni bakiyeniz : "+(bakiye-cekilenMiktar));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Iyi gunler dileriz.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gecersiz islem!");
        }

    }
}
