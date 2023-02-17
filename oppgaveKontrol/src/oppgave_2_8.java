public class oppgave_2_8 {
    public static void main(String[] args) {
        int tall=0;
        int sum=0;
        int antallTall=0;
        double gjennomsnitt=0;
        while (tall<100){
            sum += tall;
            tall+=2;
            antallTall ++;
        }
        System.out.println("toplam "+sum);
        System.out.println("kac sayi var "+antallTall);
        System.out.println("ortalama "+ (sum/antallTall));
    }
}

//Oppgave 8
//Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
//
//Finn også gjennomsnittet.