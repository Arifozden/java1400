import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
String valg= JOptionPane.showInputDialog("C=Konvert fra celcius grader (C) til fahrenheit (F)"+"\n"+
"F=Konvert fra fahrenheit (F) til celcius grader (C)");
String innTemp=JOptionPane.showInputDialog("Skriv inn grader");
double temp=Double.parseDouble(innTemp);
double resultat;
String resultatText;
if(valg.equals("C")){
    resultat=(temp*1.8)+32;
    resultatText=temp+" C er lik "+String.format("%.2f",resultat)+" C";
}
else if(valg.equals("F")) {
    resultat=(temp-32)/1.8;
    resultatText=temp+" F er lik "+String.format("%.2f",resultat)+" F";
}else {
resultatText="Feil skrevet";
}

JOptionPane.showMessageDialog(null,resultatText);
    }
}
//Det skal lages en enkel løsning med inputbokser og meldingboks for å konvertere fra celcius grader (C)
//til fahrenheit (F) og motsatt.
//
//Løsningen skal gjøre følgende :
//Lese inn en streng fra en inputdialogboks hvor det skal oppgis hva det skal konverteres FRA (C eller F
//skal skrives inn)
//Lese så inn gradene fra en ny inputdialogboks
//Konvertere gradene til en double
//Avhengig av hva som er skrevet inn i den første inputboksen regne ut resultatet via følgende formler:
//Fra Celcius til Fahrenheit: F = C * 1.8 + 32
//fra Fahrenheit til Celcius: C = (F - 32) / 1.8
//Skriv tilslutt ut resultatet med passende ledetekst med to desimaler i en meldingsboks.
//
//Dersom det ikke er skrevet inn hverken C eller F i den første inputboksen skal det ikke regnes ut noe, men
//skrives ut i meldingsboksen at det må skrives inn enten C eller F.