import javax.swing.*;

public class oppgave3 {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din"));
        if(alder>17){
            JOptionPane.showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok");
        }
        else{
            JOptionPane.showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
        }
    }
}
//Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).