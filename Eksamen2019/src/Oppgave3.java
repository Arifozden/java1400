import java.util.ArrayList;

class Bok{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }
    public String toString(){
        return "Tittel = "+tittel+"\nForfatter = "+forfatter+"\nPris = "+pris+"\n";
    }
}
class Papirbok extends Bok{
    private int ISBN;

    public Papirbok(String tittel, String forfatter, double pris, int ISBN) {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }
    public String toString(){
        return super.toString()+"ISBN = "+ISBN+"\n";
    }
}
class Lydbok extends Bok{
    private int lengdeminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdeminutter) {
        super(tittel, forfatter, pris);
        this.lengdeminutter = lengdeminutter;
    }
    public String toString(){
        return super.toString()+"Lengde minutter = "+lengdeminutter+"\n";
    }
}
public class Oppgave3 {
    public static void main(String[] args) {
        ArrayList<Bok> typeBok=new ArrayList<>();
       Lydbok enLydbok=new Lydbok("Kniv", "Jo Nesbø",90.50,120);
       Papirbok enPapirbok=new Papirbok("Kniv", "Jo Nesbø", 345.50, 123456789);
       typeBok.add(enPapirbok);
       typeBok.add(enLydbok);
       for(Bok enBok : typeBok){
           System.out.println(enBok);
       }
    }
}
