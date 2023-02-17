import java.sql.SQLOutput;

public class meto {
    public static void main(String[] args) {
        boolean uyeMi=true;
        int uyelikYili=3;
        double satisFiyati=250;

        indirimliFiyatHesapla(uyeMi, uyelikYili, satisFiyati);


    }
    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satisFiyati){
        if (uyeMi){
            if (uyelikYili<5){
                System.out.println("Urun fiyati : "+satisFiyati+"\n Indirim Miktari : "+satisFiyati*0.1+"\n Indirimli Fiyat : "+(satisFiyati-satisFiyati*0.1));
            }else {
                System.out.println("Urun fiyati : "+satisFiyati+"\n Indirim Miktari : "+satisFiyati*0.15+"\n Indirimli Fiyat : "+(satisFiyati-satisFiyati*0.15));
            }
        }else {
            System.out.println("Urun fiyati : "+satisFiyati+"\n Indirim Miktari : "+satisFiyati*0.05+"\n Indirimli Fiyat : "+(satisFiyati-satisFiyati*0.05));
        }
    }
}
