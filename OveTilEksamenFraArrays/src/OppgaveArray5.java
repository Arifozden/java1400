import java.util.Arrays;

public class OppgaveArray5 {
    public static void main(String[] args) {
        int []array1={45, 34, 5, 8, 10, 2, 13, 25};
        int største=array1[0];
        int minste=array1[0];
        for(int i : array1){
            if (i>største){
                største=i;
            }
            if (i<minste){
                minste=i;
            }
        }
        System.out.println("Største tall er "+største);
        System.out.println("Minste tall er "+minste );

        //Arrays.sort(array1);

        //System.out.println(array1[0]);
        //System.out.println(array1[array1.length-1]);
    }
}
//Oppgave 5
//Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
// Tips: Sett største og minste tallet til første elementet i arrayet før løkken.