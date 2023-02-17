import javax.swing.*;

public class IfDeneme1 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(JOptionPane.showInputDialog("skriv inn din alder"));
        if (alder < 13) {
            System.out.println("Du er et barn");
        }
        else if (alder >= 13 && alder < 18) {
            System.out.println("Du er en ungdom");
        }
        else if (alder >= 18 && alder < 70) {
            System.out.println("Du er voksen");
        }
        else {
            System.out.println("Du er pensjonist");
        }

    }
}
//Et program skal lese inn en alder (heltall) og så skal det skrive ut en tekst avhengig av alderen:
//
//Du er et barn ( mindre enn 13 år)
//De er en ungdom (mellom 13 og 18 år)
//Du er voksen (mellom 18 og 70 år)
//Du er pensjonist (over 70 år).