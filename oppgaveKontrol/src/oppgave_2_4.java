public class oppgave_2_4 {
    public static void main(String[] args) {
        double gjennomsnitt;
        int sum=0;
        int antallPartall=0;
        for (int i=0; i<100;i+=2){
            sum+=i;
            antallPartall++;
        }
        gjennomsnitt=sum/antallPartall;
        System.out.println(sum);
        System.out.println(gjennomsnitt);
    }
}
//Oppgave 4
//Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)