class Klokke {
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        setTime(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time >= 0 && time <= 23) {
            this.time = time;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if (minutter >= 0 && minutter <= 59) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if (sekunder >= 0 && sekunder <= 59) {
            this.sekunder = sekunder;
        }
    }
    public void visTiden(){
        String tiden="Klokke er "+time+":"+minutter+":"+sekunder;
        System.out.println(tiden);
    }
}
public class OppgaveClass2_4 {
    public static void main(String[] args) {
        Klokke tid1=new Klokke(12,22,33);
        tid1.visTiden();
        Klokke tid2=new Klokke(25, 33,45);
        tid2.visTiden();
    }
}
//Oppgave 4
//Lag en klasse kalt Klokke.
// Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.
//
//Klassen skal ha en konstruktør som initialiserer alle attributtene.
// Lag også get/set metoder for disse.
// Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).
//
//Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.
//
//Skriv så kode i main for å teste ut denne klassen.