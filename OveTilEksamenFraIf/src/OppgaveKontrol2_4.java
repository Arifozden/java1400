import javax.swing.*;

public class OppgaveKontrol2_4 {
    public static void main(String[] args) {

        int nummer=0;
        int størst=0;
        for (int teller=0 ; teller<10 ; teller++){
            nummer=Integer.parseInt(JOptionPane.showInputDialog("skriv inn et tall"));
            if(nummer>størst){
                størst=nummer;
            }

        }
        JOptionPane.showMessageDialog(null, størst);
    }
}
//Oppgave 4
//Et program skal finne det største tallet av 10 heltall.
// Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
// Programmet skal bruke tre heltallsvariabler:
//
//telller; som teller 0 til 10
//nummer; som er tallet som er lest inn
//størst; det til en hver tid største tallet