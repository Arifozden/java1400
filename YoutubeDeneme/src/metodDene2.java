import javax.swing.*;

public class metodDene2 {
    public static void main(String[] args) {
        String isim= JOptionPane.showInputDialog("Ismi giriniz");
        String soyisim=JOptionPane.showInputDialog("Soyismi giriniz");
        String isimSoyisim=isimDuzenle(isim, soyisim);

        System.out.println("Ilk girilen : "+isim+" "+soyisim);
        System.out.println("Duzenlenmis hali : "+isimSoyisim);
    }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        return isimDuzenlenmis +" "+soyisimDuzenlenmis;
    }
}
