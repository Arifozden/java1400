package uke42;


import static javax.swing.JOptionPane.*;
import java.util.Calendar;
public class Kisi {
    public String isim=showInputDialog("Isminiz?");

    public int dogumYili=Integer.parseInt(showInputDialog("Merhaba "+isim+". Dogum yiliniz?"));
    public Calendar calendar = Calendar.getInstance();
    public int simdiYil=calendar.getWeekYear();

    public int yas=simdiYil-dogumYili;

    public static void main(String[] args) {
        Kisi baba=new Kisi();
        Kisi anne=new Kisi();
        Kisi abla=new Kisi();
        Kisi abi=new Kisi();
        Kisi bebek=new Kisi();
        System.out.println("Ailenin babasinin ismi "+baba.isim+" ve yasi "+ baba.yas);
        System.out.println("Ailenin annesinin ismi "+anne.isim+" ve yasi "+ anne.yas);
        System.out.println("Ailenin ablasinin ismi "+abla.isim+" ve yasi "+ abla.yas);
        System.out.println("Ailenin abisinin ismi "+abi.isim+" ve yasi "+ abi.yas);
        System.out.println("Ailenin en kucugunun ismi "+bebek.isim+" ve yasi "+ bebek.yas);



    }

    }

