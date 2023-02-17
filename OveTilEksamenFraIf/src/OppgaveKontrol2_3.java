import javax.swing.*;

public class OppgaveKontrol2_3 {
    public static void main(String[] args) {
double inntekt;
double skatt;
String ut="";
for(int i=1 ; i<4 ; i++){
    inntekt=Double.parseDouble(JOptionPane.showInputDialog("Skriv inn inntekt"));
    if(inntekt<500000){
        skatt=inntekt*0.3;
    }
    else {
        skatt=inntekt*0.5;
    }
ut+= "Inntekt på "+inntekt+" kr gir skatt på "+skatt+" kr\n";
}
        System.out.println(ut);
    }
}
//Oppgave 3
//Lag et program som beregner skatten til tre personer.
// Skatten er 30 % frem til 500.000 kr og 50 % over.
// Les inn navn og inntekt på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.