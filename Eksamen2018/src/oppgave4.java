import java.util.ArrayList;

class Ansatt{
    public String navn;
    public Dato født;
    public Dato tilrådt;

    public Ansatt(String navn, Dato født, Dato tilrådt) {
        this.navn = navn;
        this.født = født;
        this.tilrådt = tilrådt;
    }
    public String toString(){
        return "Navn : "+navn+"\nFødt : "+født+"\nTilrådt : "+tilrådt+"\n";
    }
    // opprett 3 attributter
    // navn, født og tiltrådt, de to siste skal være av type Dato.

    // opprett også en konstruktør for disse

    // lag også en toString-metode for klassens attributter
}

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }
    public String toString(){
        return dag+" "+månedsnavn(måned)+" "+år;
    }

    // skriv en toString metode slik at datoen kommer ut på følgende format:
    // dd månedsnavn år, f.eks 1 januar 2019

}

public class oppgave4 {

    public static void main(String[] args) {
        ArrayList<Ansatt> Met=new ArrayList<>();
        Dato dato1=new Dato(3,3,1986);
        Dato dato2=new Dato(1,10,2006);
        Ansatt ansatt1=new Ansatt("Line Jensen", dato1,dato2);
        Dato dato3=new Dato(12,4,1990);
        Dato dato4=new Dato(5,6,2001);
        Ansatt ansatt2=new Ansatt("Ole Olsen", dato3,dato4);
        System.out.println(ansatt1);
        System.out.println(ansatt2);
        // opprett en ArrayListe og legg to ansatte inn i denne
        // skriv så alt innholdet i arrraylisten ut på system.out.
    }
}

//Koden som skal kompleteres (sluttføres) vises til venstre. 3 kode-biter skal lages:
//1) Fullfør klassen Ansatt
//2) Skriv toString metoden i klassen Dato
//3) Fullfør main-metoden.