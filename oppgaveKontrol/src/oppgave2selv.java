import javax.swing.*;

public class oppgave2selv {
    public static void main(String[] args) {
        //Oppgave 2
        //Les inn en heltallsvariabel "alder".
        //Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
        //
        //”Du kan ta førerkortet for bil da du er gammel nok” eller
        //”Du er for ung til å ta førerkort for bil”.
        //
        //Gjør dette uten bruk av en else-setning (bruk to if-setninger).
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder"));
        if(alder>=18){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkortet for bil da du er gammel nok");
        }
        if (alder<18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
    }
}
