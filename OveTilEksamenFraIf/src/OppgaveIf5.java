import javax.swing.*;

public class OppgaveIf5 {
    public static void main(String[] args) {
        String måned= JOptionPane.showInputDialog("Hvilken måned er det nå?\njanuar\nfebruar\nmars\napril\nmai\njuni\njuli\naugust\nseptember\noktober\nnovember\ndesember" );
        if (måned.equals("juni") || måned.equals("juli") || måned.equals("august")){
            System.out.println("Nå er det sommer");
    } else if (måned.equals("september") || måned.equals("oktober") || måned.equals("november")) {
            System.out.println("Nå er det høst");
        } else if (måned.equals("desember") || måned.equals("januar") || måned.equals("februar")) {
            System.out.println("Nå er det vinter");
        } else if (måned.equals("mars") || måned.equals("april") || måned.equals("mai")) {
            System.out.println("Nå er det vår");
        } else {
            System.out.println("feil skrevet");

    }}}
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