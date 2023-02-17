public class OppgaveArray2 {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5,6,7,8,9};

        int sum=0;
        int sum1=0;
        int teller=0;
        for (int i=array1[0]; i<=array1.length;i++){
            sum+=i;


        }
        System.out.println("Summen av tallene : "+sum);
        System.out.println("Gjennomsnittet av tallene : "+((double)(sum)/(double) (array1.length)));

        for (int i = array1[0]; i <=array1.length ; i++) {
            if(i>5){
                sum1+=i;
                teller++;
            }
             }
        System.out.println("Summen av tallene : "+sum1);
        System.out.println("Gjennomsnittet av tallene : "+((double)(sum1)/(double) (teller)));
    }
}
//Oppgave 2
//Bruk arrayet i oppgave 1.
// Summer alle tallene med en for-løkke.
// Finn så gjennomsnittet av alle tallene.
// Summer så alle tallene som er større enn 5.
// Finn så gjennomsnittet av disse.
// Summer så tallene med en forenklet for-løkke.