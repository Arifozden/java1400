class Liste{
    public static int finnPositive(int []list){
        int teller=0;
        for (int i :list){
            if(i>0){
                teller++;
            }
        }
        return teller;
    }
    public static int forekommer(int[]list, int forekommendeTall){

        int teller2=0;
        for(int i:list){
            if(i==forekommendeTall){
            teller2++;
        }
    }return teller2;
}
public static int største(int []list){
        int størst=0;
        for (int i:list){
            if(i>størst){
                størst=i;
            }
        }return størst;
}
}

public class Oppgave3 {
    public static void main(String[] args) {
int []liste={1,2,3,4,5,5,4,3,2,1,1,2,3,4,5,-1,-2,-5,-5};

        System.out.println(Liste.finnPositive(liste));
        System.out.println(Liste.største(liste));
        System.out.println(Liste.forekommer(liste,1));


    }
}
//Lag en klasse kalt Liste for å behandle arrays.
//Lag følgende statiske metoder i denne klassen som behandler arrays:
//
//1)  Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
//2)  Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal også
//inn i metoden)
//3) Tar et heltallsarray inn og finner det største tallet i arrayet
//
//Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
//Resultatet skal skrives ut på System.out.