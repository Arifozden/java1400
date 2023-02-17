public class OppgaveArray7 {
    public static void main(String[] args) {
        int []array1={45, 34, 5, 8, 10, 2, 13, 25};
        int oddetall=0;
        int partall=0;
        for (int i = 0; i < array1.length; i++) {
            if(i%2==0){
                partall++;
            }
            else {oddetall++;

        }

    }
        System.out.println("antall oddetall er "+oddetall+" , og antall partall er "+partall );
}}
//Oppgave 7
//Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.