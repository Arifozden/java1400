class Klokke{  //Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time1, int minutter1, int sekunder1){  //Klassen skal ha en konstruktør som initialiserer alle attributtene.
        setTime(time1);
        setMinutter(minutter1);
        setSekunder(sekunder1);

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time>=0 && time<24){
            this.time=time;
        } else {
            System.out.println("Yanlis veri girildi");
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if (minutter>=0 && minutter<60){
            this.minutter = minutter;
        }else{
            System.out.println("Yanlis veri girildi");
        }

    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if(sekunder>=0 && sekunder<60){
            this.sekunder = sekunder;
        }else {
            System.out.println("Yanlis veri girildi");
        }

    }
    public void visTiden(){
        //Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.
        String ut=time+":"+minutter+":"+sekunder;
        System.out.println(ut);

    }
}
public class oppgave4 {
    public static void main(String[] args) {
Klokke k1=new Klokke(14,22,22);
k1.visTiden();
    }
}
//Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.
//
//Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
// Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).    set metodlarina if yapilari yazdik
//
//Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.
//
//Skriv så kode i main for å teste ut denne klassen.