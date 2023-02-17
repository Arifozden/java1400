import javax.swing.*;

public class OppgaveIf4 {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din alder"));
        if(alder<18){
            System.out.println("Du er for ung til å ta førerkort for bil");
        }
        if(alder>=18 &&alder<70)    {
            System.out.println("Du kan ta førerkort for bil og du trenger ikke årlige legesjekker ");
        }
        if(alder>=70){
            System.out.println("Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
    }
}
//Oppgave 4
//Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år).
// Oppdater oppgavene over slik at programmet skriver ut meldingene
//
//Du er for ung til å ta førerkort for bil
//Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
//Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker