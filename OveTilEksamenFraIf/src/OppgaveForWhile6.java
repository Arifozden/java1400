public class OppgaveForWhile6 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while (i<10){

            sum=sum+i;  //sum+=i     bu iki islem ayni (sum=sum+i) ile (sum+=i)
            i++;
        }
        System.out.println(sum);
    }
}
//Oppgave 6
//Lag en while-løkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)