public class Oppgave4_1 {
    public static void main(String[] args) {
        int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
        int sum=0;
        for (int i=0;i< liste.length;i++){
            sum+=liste[i];
        }
        System.out.println(sum);
        System.out.println("");
        int sum2=0;
        for(int i : liste){
            sum2+=i;
            i++;

        }
        System.out.println(sum2);
    }
}
//Gitt følgende int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
//
//Skriv kode for å summere tallene med en for-løkke.
// Gjør det samme med en for each -løkke (utvidet for-løkke).
// Summene skal skrives ut i System.out på to forskjellige linjer.