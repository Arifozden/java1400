import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OppgaveIf5b {
    public static void main(String[] args) {
        String måned= JOptionPane.showInputDialog("Hvilken måned er det nå?\njanuar\nfebruar\nmars\napril\nmai\njuni\njuli\naugust\nseptember\noktober\nnovember\ndesember");
        switch (måned){
            case "juni":
            case "juli":
            case "august":
                System.out.println("Det er sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                System.out.println("Det er Høst");
                break;
            case "desember":
            case "januar":
            case "februar":
                System.out.println("Det er Vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                System.out.println("Det er Vår");
                break;
            default:
                System.out.println("Feil skrevet");
                break;
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