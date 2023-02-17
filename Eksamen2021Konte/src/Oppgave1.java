public class Oppgave1 {
    public static void main(String[] args) {
        int [] liste={20, 34,-4,4,5,11,-23};
        for(int i :liste){
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i=liste.length-1;i>=0;i--){
            System.out.print(+liste[i]+" ");
        }
        System.out.println("");
        int sum=0;
        for(int i : liste){
            sum+=i;

        }
        System.out.println("Summen er "+sum);
        double gjemmomsnittet=((double)sum/ liste.length);
        System.out.println("Gjennomsnittet av tallene i arrayet : "+gjemmomsnittet);

        for (int i:liste){
            if(i>0&&i<20){
                System.out.print(i+" ");
            }
        }
    }
}
//Definer følgende heltalls-array : 20, 34,-4,4,5,11,-23. Lag et Java-program som ved hjelp av en
//løkke for hver av deloppgavene:
//1. Skriver ut tabellen med mellomrom mellom tallene
//2. Skriver ut tabellen baklengs med mellomrom mellom tallene
//3. Summerer tabellen
//4. Finner gjennomsnittet av tallene i tabellen
//5. Skriver ut tallene som er mellom 0 og 20 (ikke inkludert tallene)