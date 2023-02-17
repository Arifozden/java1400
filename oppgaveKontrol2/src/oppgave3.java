import static javax.swing.JOptionPane.*;

public class oppgave3 {
    public static void main(String[] args) {
        double inntekt;
        double skatt;
        String ut = "";
        for (int i = 1;i < 4; i++){

            inntekt = Double.parseDouble(showInputDialog("Skriv inn inntekten til personen"));
            if(inntekt > 500_000){
                skatt = (inntekt-500_000)*0.5;
                skatt += 500_000 * 0.3;
            }
            else{
                skatt = inntekt * 0.3;
            }
            ut += "Inntekt på "+inntekt+" kr gir skatt på "+skatt+" kr\n";
        }
        showMessageDialog(null, ut);
    }
}
//Oppgave 3
//Lag et program som beregner skatten til tre personer.
// Skatten er 30 % frem til 500.000 kr og 50 % over.
// Les inn navn og inntekt på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.