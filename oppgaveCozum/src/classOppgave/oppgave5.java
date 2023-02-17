package classOppgave;

class Kalkulator{
    public static void addere(double tall1, double tall2) {
        double sum= tall1+tall2;
        System.out.println(sum);
    }
    public static void subtrahere(double tall1, double tall2) {
        double sum= tall1-tall2;
        System.out.println(sum);
    }
    public static void multiplisere(double tall1, double tall2) {
        double sum= tall1*tall2;
        System.out.println(sum);
    }
    public static void dividere(double tall1, double tall2) {
        double sum = 0;
        if (tall2 != 0) {
            sum = tall1 / tall2;
        }
        else {
            System.out.println("Tall 2 kan ikke være 0");
        }
        System.out.println(sum);

    }}
    public class oppgave5 {
    public static void main(String[] args) {

        Kalkulator.addere(1,2);
        Kalkulator.subtrahere(1,2);
        Kalkulator.multiplisere(1,2);
        Kalkulator.dividere(1,0);
    }}

//Oppgave 5
//Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
// Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.
//
//Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.