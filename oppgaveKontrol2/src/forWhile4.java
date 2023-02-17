public class forWhile4 {
    public static void main(String[] args) {
        int sum=0;
        double gjennomsnitt;
        int i;
        int teller=0;
        for (i = 0; i < 100 ; i+=2) {
            sum = sum+i;
            teller++;

        }
        gjennomsnitt = sum/teller;
        System.out.println("sum "+sum);
        System.out.println("gjennomsnitt "+gjennomsnitt);
    }
}
//Oppgave 4
//Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)