import static javax.swing.JOptionPane.*;

public class oppgave5b {
    public static void main(String[] args) {
        String maned = null;
        switch (maned){
            case "juni":
            case "juli":
            case "august":
                showMessageDialog(null,"Sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                showMessageDialog(null,"Høst");
                break;
            case "desember":
            case "januar":
            case "februar":
                showMessageDialog(null,"Vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                showMessageDialog(null,"Vår");
                break;
            default:
                showMessageDialog(null, "Feil skrevet");
        }
    }
}
//Oppgave 5
//Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
//
//Sommer : juni, juli, august
//Høst : september, oktober, november
//Vinter: desember, januar, februar,
//Vår : mars, april, mai,
//a) Lag først et program som løser det med if /else
//
//b) Lag deretter et program som løser det med bruk av switch.