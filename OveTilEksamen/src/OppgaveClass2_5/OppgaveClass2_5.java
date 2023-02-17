package OppgaveClass2_5;

import javax.swing.*;
//Attributtene for kontoinnehavers navn, kontornummer og saldo.
class Konto {
    private String navn;
    private String kontonr;
    private double saldo;
    //  Konstruktør som skal gi startverdier til ALLE attributtene
    public Konto(String navn, String kontonr, double saldo) {
        this.navn = navn;
        this.kontonr = kontonr;
        this.saldo = saldo;
    }
    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens navn, kontonummer og saldo i et dialogvindu. */
    public void utskrift(){
        String ut="Kontoinnehavers navn :"+navn+"\nKontonr : "+kontonr+"\nSaldo : "+String.format("%.2f",saldo)+" kr. ";
        JOptionPane.showMessageDialog(null,ut);
    }
    //    /*  Metode som setter inn et beløp på kontoen.
//        Beløpets størrelse skal tas imot via en parameter til metoden.
//        Metoden skal returnere en tekst som inneholder informasjon om
//        den nye saldoen.  */
    public String setInn(double beløp){
        saldo += beløp;
        return "Den nye saldoen er"+String.format("%.2f",saldo);
    }
    //    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
//        at det er dekning for beløpet.
//        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
//        Hvis det er dekning på kontoen, skal metoden returnere en tekst
//        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
//        skal den returnerte teksten inneholde informasjon om det. */
    public String taUt(double beløp){
        String ut = "";
        if(beløp <=saldo){
            saldo=saldo-beløp;
            ut="Den nye saldoen er : "+String.format("%.2f",saldo);
            } else {
            ut = "ikke dekning på konto";
        }
        return ut;
    }
}

public class OppgaveClass2_5{
    public static void main(String[] args) {
        String kontonavn=JOptionPane.showInputDialog("Angi kontonavn");
        String kontonr = JOptionPane.showInputDialog("Angi kontonummer");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Angi saldo"));
        Konto sparekonto = new Konto(kontonavn, kontonr, saldo  );
        System.out.println(sparekonto.setInn(1000));
        System.out.println(sparekonto.taUt(10));
        System.out.println(sparekonto.setInn(1000));
        sparekonto.utskrift();

    }
}
//// nødvendige import-setning(er)
//
//public class Konto
//{
//    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
//
//    //  Kontruktør som skal gi startverdier til ALLE attributtene
//
//    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
//       navn, kontonummer og saldo i et dialogvindu. */
//
//    /*  Metode som setter inn et beløp på kontoen.
//        Beløpets størrelse skal tas imot via en parameter til metoden.
//        Metoden skal returnere en tekst som inneholder informasjon om
//        den nye saldoen.  */
//
//    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
//        at det er dekning for beløpet.
//        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
//        Hvis det er dekning på kontoen, skal metoden returnere en tekst
//        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
//        skal den returnerte teksten inneholde informasjon om det. */
//
//} // end of class Konto
// nødvendige import-setning(er)

//public class Bank
/*
    public static void main(String[] args)
    {
    /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */

    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */

  //  }
//} // end of class Kontotest*/