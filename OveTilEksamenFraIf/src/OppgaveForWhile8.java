public class OppgaveForWhile8 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int teller=0;
        while (i<100){
            sum=sum+i;
            i+=2;
            teller++;
        }
        System.out.println(sum);
        double gjennomsnitt=(double) sum/ (double) teller;
        System.out.println(gjennomsnitt);
    }
}
//Oppgave 8
//Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
//
//Finn også gjennomsnittet.