package oblig1;

import javax.swing.*;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter


    public Vare(String navn1, int antall1, double pris1) {
        navn = navn1;
        antall = antall1;
        pris = pris1;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }

    public void setNavn(String navn1) {
        navn = navn1;
    }

    public void setAntall(int antall1) {
        antall = antall1;
    }

    public void setPris(double pris1) {
        pris = pris1;
    }

    // antall og pris må være større enn null
    public double totalPris() {
        double totalPris1 = antall * pris;

        return totalPris1;
    }
}


class Oblig1Oppgave2{
    public static void main(String[] args) {

        
        // les inn navn, antall og pris for vare 1
        String innNavn1 = JOptionPane.showInputDialog("skriv inn navn for 1");
        String innAntall1 = JOptionPane.showInputDialog("skriv inn antall for 1");
        String innPris1 = JOptionPane.showInputDialog("skriv inn pris for 1");


        int innAntall11=0;
        double innPris11=0;
        try {
            innAntall11=Integer.parseInt(innAntall1);
            innPris11=Double.parseDouble(innPris1);
        }
        catch (Exception e){
            System.out.println("Degerler yanlis");
        }

        Vare v1=new Vare(innNavn1, innAntall11, innPris11);
        Vare v2=new Vare(innNavn1, innAntall11, innPris11);
        // les inn navn, antall og pris for vare 2 kopyala yapistir---

        // bruk avvikshåntering (try/catch) for å konvertere --
        // antall og pris for vare 1 og vare 2--

        // opprett to vare-objekter med de innleste verdiene yapildi--

        // beregn og skriv ut total pris for alle varer i System.out--
        double totalPris= v1.totalPris()+v2.totalPris();
        System.out.println(totalPris);
}


    }

