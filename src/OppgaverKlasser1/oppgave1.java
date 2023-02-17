package OppgaverKlasser1;
class Boker{
    String tittel;
    int pris;
    String forfatter;
    String isbnNummer;

    void skrivUtBok(){
        String ut="Her er informasjonen til boka ; Tittel : "+tittel+" Pris : "+pris+" Forfatter : "+forfatter+" iSBN-nummer : "+isbnNummer;
        System.out.println(ut);
}


}
public class oppgave1 {
    public static void main(String[] args) {
        Boker bok1=new Boker();
        bok1.tittel="Animal's Farm";
        bok1.pris=100;
        bok1.forfatter="George Orwell";
        bok1.isbnNummer="123443";

        bok1.skrivUtBok();

    }
}
