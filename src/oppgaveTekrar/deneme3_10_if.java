package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_10_if {
    public static void main(String[] args) {
int alder=Integer.parseInt(showInputDialog("Hva er din alder?"));
if(alder>=18){
    System.out.println("Du kan ta førerkortet for bil da du er gammel nok");
}else{
    System.out.println("Du er for ung til å ta førerkort for bil");
}
    }
}

//Oppgave 10
//
//Lag et program som leser inn et heltall, alder.
// Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
// ”Du kan ta førerkortet for bil da du er gammel nok” eller
// ”Du er for ung til å ta førerkort for bil”.
// Gjør dette ved bruk to if-setninger.