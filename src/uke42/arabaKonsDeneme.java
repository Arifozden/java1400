package uke42;
class araba{
    String model;
    int yil;
    int fiyat;
    public araba(){
        this.model="volvo";

    }
}
public class arabaKonsDeneme {
    public static void main(String[] args) {

        araba a1=new araba();
        araba a2=new araba();
        araba a3=new araba();
        a1.fiyat=10000;
        a1.yil=2020;
        a2.fiyat=11000;
        a2.yil=2019;


        System.out.println(a1.yil+" "+a1.model+" "+ a1.fiyat+" euro");
        System.out.println(a2.yil+" "+a2.model+" "+ a2.fiyat+" euro");
        System.out.println(a3.yil+" "+a3.model+" "+ a3.fiyat+" euro");
    }



}
