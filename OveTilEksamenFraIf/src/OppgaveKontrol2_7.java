
import static javax.swing.JOptionPane.*;

public class OppgaveKontrol2_7 {
    public static void main(String[] args) {
        int innTall = Integer.parseInt(showInputDialog("Skriv inn et heltall mellom 1 og 10"));
        String ut="";
        for (int i=0; i<=innTall;i++){
            for (int j=0;j<i;j++){
                ut+=":)";
            }
            ut+="\n";
        }
        showMessageDialog(null, ut);
    }
}
//Oppgave 7
//Lag et program som skriver ut en rettvinklet trekant med *.
// Input hvor mange stjerner grunnflaten skal være. F.eks: 3 * gir
//
//X
//XX
//XXX