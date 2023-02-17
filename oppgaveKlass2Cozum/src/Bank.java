import javax.swing.*;

class Konto {

    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.   istenenler girildi asagida
    public String navn;
    public String kontonummer;
    public double saldo;
    //  Kontruktør som skal gi startverdier til ALLE attributtene-   asagida konstruktor olusturuldu
    public Konto(String navn, String kontonummer, double saldo){
        this.navn=navn;
        this.kontonummer=kontonummer;
        this.saldo=saldo;
    }
    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu.   asagida yazildi */
    public void utSkrift(){
        String ut="Navn : "+navn+"\nKontonummer :"+kontonummer+"\nSaldo :"+saldo;
        JOptionPane.showMessageDialog(null, ut);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
public String setBeløp(double innBeløp){
        //saldo=saldo+innBeløp de yazabiliriz ama kod yaziminda asagidaki daha makbul
       saldo+=innBeløp;
       String ut= "Ny saldo : "+saldo;
       return ut;
}

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.     burada yazildi metod*/
    public String uttak(double beløp){
        String ut;
        if(saldo>=beløp){
            saldo-=beløp;
            ut="Ny saldoen er : "+saldo+" Velkommen tilbake";
        }
        else {
            ut="Beløpet er for høyt. Du har ikke nok penger på kontoen";
        }
        JOptionPane.showMessageDialog(null, ut);
        /*Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
                skal den returnerte teksten inneholde informasjon om det. */
        return ut;
    }
}

/*  Metode som tar ut et beløp fra kontoen, under forutsetning av
      at det er dekning for beløpet.
      Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
      Hvis det er dekning på kontoen, skal metoden returnere en tekst
      med informasjon om den nye saldoen. Hvis  det ikke er dekning,
      skal den returnerte teksten inneholde informasjon om det. */
// end of class Konto
public class Bank {
   /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */

    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */



    public static void main(String[] args) {
        String innNavn = JOptionPane.showInputDialog("Kontoinnehaversnavn : ");
        String innKontoNummer = JOptionPane.showInputDialog("Kontonummer : ");
        double innSaldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo : "));
Konto k= new Konto(innNavn, innKontoNummer, innSaldo);

k.utSkrift();
double innBeløp=Double.parseDouble(JOptionPane.showInputDialog("Hvor mye vil du sette inn?"));
k.setBeløp(innBeløp);
k.utSkrift();
double utBeløp=Double.parseDouble(JOptionPane.showInputDialog("Hvor mye vil du ta ut fra kontoen?"));
k.uttak(utBeløp);
k.utSkrift();
    }
}
