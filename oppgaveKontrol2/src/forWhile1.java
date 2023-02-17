public class forWhile1 {
    public static void main(String[] args) {
        int sum=0;
        int faktor=1;
        for (int i = 1; i < 10 ; i++) {
            faktor=faktor*i;
            sum+=i;
            System.out.println(i);
            
        }
        System.out.println("9! : "+faktor);
        System.out.println("toplam :"+sum);
    }
}

//Oppgave 1
//Lag en forløkke som viser alle tallene fra 0 til 10 på hver sin linje under hverandre (0 til og med 9).