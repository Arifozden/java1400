package oppgaveTekrar;
import static javax.swing.JOptionPane.*;
public class deneme3_1 {
    public static void main(String[] args) {
        String navn=showInputDialog("Skriv navnet");
        String innAlder=showInputDialog("Skriv alder");
        int alder=Integer.parseInt(innAlder);
        int fodselsar=2022-alder;
        int pensjonistAr=fodselsar+67;
        String ut=navn+" er i dag "+alder+" år. Han er født i "+fodselsar+". I "+pensjonistAr+ " er han 67 år og da vil han være pensjonist.";
        System.out.println(ut);
    }
}
//Oppgave 1
//
//Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel):
// Per Olsen er i dag 32 år. Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.
//
//(Tallene er utifra året 2018).