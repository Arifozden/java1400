package uke42;

class Bil{
    public String farge;  //attribute
    public int alder;

    public void visFarge(){   //methode
        System.out.println("fargen til bilen er : "+farge+" og bilen er "+alder+" år gammel");


    }//method u iki sekilde de yazabilriiz. ustteki ve alttaki

    public void settFarge(String fargen, int alderen){
        farge=fargen;
        alder=alderen;
    }
    public String hentFarge(){
        return farge;
    }
}
public class objektBil {
    public static void main(String[] args) {
        Bil bil1=new Bil();
        //bil1.farge="Rød";  //vi kaller
        bil1.settFarge("Blå", 100);
        bil1.visFarge();   //vi kaller methoden
        String bilFargen;
        bilFargen=bil1.hentFarge();
        System.out.println("Fargen til bilen er : "+bilFargen);

    }
}
