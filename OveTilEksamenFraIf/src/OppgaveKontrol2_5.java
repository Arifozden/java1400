import javax.swing.*;

public class OppgaveKontrol2_5 {
    public static void main(String[] args) {
        int nummer=0;
        int størsteTall=0;
        int nestStørsteTall=0;
        for (int teller=0 ; teller<10 ; teller++){
            nummer=Integer.parseInt(JOptionPane.showInputDialog("skriv inn et tall"));
            if(nummer>størsteTall){
                nestStørsteTall=størsteTall;
                størsteTall=nummer;
            } else if (nestStørsteTall<nummer) {
                nestStørsteTall=nummer;
            }

        }
        System.out.println(størsteTall);
        System.out.println(nestStørsteTall);
    }
}

//Oppgave 5
//Ref. forrige oppgave. Lag et program som finner de to største tallene av 10 heltall. En ekstra variabel må brukes.

//ref:
//Et program skal finne det største tallet av 10 heltall.
// Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
// Programmet skal bruke tre heltallsvariabler:
//
//telller; som teller 0 til 10
//nummer; som er tallet som er lest inn
//størst; det til en hver tid største tallet
