public class Oppgave2 {
    public static void main(String[] args) {
        int []liste={-3,41,5,-3,2,49};
        int teller=0;
        for(int i : liste){
            if(i>10){
                teller++;
            }
        }
        System.out.println(teller);
        System.out.println("");
        for(int i =0;i<liste.length;i+=2){

            System.out.print(liste[i]+" ");
        }

        System.out.println("");
        int sum=0;
        double snitt=0;
        int teller2=0;
        for(int i :liste){
            if (i>0){
                sum+=i;
                teller2++;
            }

        }System.out.println("Summen av alle positive tallene er "+sum);
        System.out.println("Gjennomsnittet av alle positive tallene er "+((double)sum/teller2));
    }
}
//Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:

//a)  Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
//b)  Skriv ut annethvert element
//c)  Skriv ut summen av alle positive tall i arrayet
//d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
//
//Bruk løkker og System.out for å skrive ut.
//
