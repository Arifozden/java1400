import javax.swing.*;

public class OppgaveIf1 {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder"));
        if(alder<=20 && alder>=18){
            System.out.println("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet");
        }else {
            System.out.println("Du er enten umyndig eller så kan du kjøpe hva du vil på polet");
    }
}}
//Oppgave 1
//Les inn en heltallsvariabel.
// Skriv så ut en tekst ”Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet”.
// Dvs. at du må ha en beslutning som tester på om alderen eller mellom 18 og 20.
// Dersom dette ikke er tilfelle skriv ut ”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”.