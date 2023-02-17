public class Oppgave1 {
    public static void main(String[] args) {
        for(int i =0;i<100;i+=3){
            System.out.print(i+" ");


        }
        System.out.println();
        int tall=2;
        int sum=0;
        int teller=0;
        while(tall<=100){
            tall+=2;
            sum=sum+tall;
            teller++;
        }
        double snitt=(double)sum/teller;
        System.out.println(snitt);
    }
}
//a) Skriv kode for å liste hvert 3. tall mellom 0 og 100. Listingen skal gjøres på en linje
//med mellomrom mellom dvs. 0 3 6 9 ..... 96 99 til System.out. Bruk en for-løkke.
//b) Skriv kode for å finne gjennomsnittet av alle partall fra og med 2 til og med 100
//(2,4,6,8 ... 98, 100) til System.out. Bruk en while-løkke.
