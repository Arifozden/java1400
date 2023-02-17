public class OppgaveArray3 {
    public static void main(String[] args) {
        String [] array1={"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
        for (int i = 0; i < array1.length; i+=2) {
            System.out.println(array1[i]+" "+array1[i+1]);

        }
    }
}
//Oppgave 3
//Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
// Skriv så ut for og etternavn på flere linjer med en løkke som vist under:
//
//Per Hansen
//Line Olsen
//....