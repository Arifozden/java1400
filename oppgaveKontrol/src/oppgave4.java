import javax.swing.*;

public class oppgave4 {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din"));
        int hoyesteAlder=70;
        if(alder>17&&alder<hoyesteAlder){
            JOptionPane.showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok");
        }

        else if(alder<18){
            JOptionPane.showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
        }
        else if(alder>=hoyesteAlder){
            JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
    }
}
//Oppgave 4
//Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år). Oppdater oppgavene over slik at programmet skriver ut meldingene
//
//Du er for ung til å ta førerkort for bil  <18
//Du kan ta førerkort for bil og du trenger ikke årlige legesjekker >=18&&<70
//Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker  >=70