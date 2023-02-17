package uke42;

public class Billl {
    public String farge;

    public static void main(String[] args) {
        Billl bil1=new Billl();
        Billl bil2=new Billl();
        Billl bil3=new Billl();
        bil1.farge="Rød";
        bil2.farge="Blå";
        bil3.farge="Grønn";

        System.out.println("Fargen til bi1 er "+bil1.farge+ " og fargen til bil2 er "+bil2.farge+" og fargen til bil3 er "+bil3.farge);
    }
}
