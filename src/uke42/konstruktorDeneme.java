package uke42;

class insan{
    int boy;
    int kilo;
    int yas;
    public insan(){
        System.out.println("insan olusturuldu");
        yas=1;
    }
    public insan(int boy, int kilo, int yas){

    }
}

public class konstruktorDeneme {
    public static void main(String[] args) {

        insan veli=new insan();
        insan ali=new insan();
        insan deli=new insan();
        ali.boy=175;
        ali.kilo=75;
        ali.yas=25;
        veli.kilo=100;
        veli.boy=200;
        veli.yas=33;
        deli.boy=100;
        deli.kilo=50;



        System.out.println("alinin yasi "+ali.yas+" kilosu : "+ali.kilo+" boyu : "+ali.boy);
        System.out.println("velinin yasi "+veli.yas+" kilosu : "+veli.kilo+" boyu : "+veli.boy);
        System.out.println("delinin yasi "+deli.yas+" kilosu : "+deli.kilo+" boyu : "+deli.boy);
    }


    }

