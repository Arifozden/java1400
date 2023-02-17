package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_6 {
    public static void main(String[] args) {
        double valut=Double.parseDouble(showInputDialog("hvor mange dollar har du?"));
        double valutaKurs=Double.parseDouble(showInputDialog("Hva er valutakurs i dag?"));
        double valutKron=valut*valutaKurs;
        String valutMedToDesimaler=String.format("%.2f", valutKron);
        System.out.println(valut+" amerikanske dollar blir til "+valutMedToDesimaler+" norske kroner");
    }
}
//Oppgave 6
//
//Lag et program som leser inn et beløp i amerikanske dollar (USD) og
// regner om og skriver ut tilsvarende beløp i norske kroner. Benytt dagens valutakurs fra nettet.