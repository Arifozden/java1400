package classOppgave;
class Person{
    String navn, adresse, telefonnummer;
    int fødselsår;

    public int regneUtAlder(){
        int alder = 2022-fødselsår;
        return alder;
    }
    public void skriv(int alder){
        String ut = navn + " med adresse "+adresse+" med telefonnummer "+ telefonnummer+ " er "+alder+" år.";
        System.out.println(ut);
    }
}
public class oppgave3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.navn ="Per Hansen";
        p1.telefonnummer= " 212122212";
        p1.adresse = "Osloveien 88";
        p1.fødselsår = 1990;

        int alder = p1.regneUtAlder();
        p1.skriv(alder);
    }
}
//Oppgave 3
//Lag en klasse kalt Person. Denne skal inneholde følgende attributter:
//
//navn
//adresse
//telefonnr
//fødselsår
//Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.
//
//Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:
//
//Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
//
//Opprett et eller flere person objekter i main-metoden for å teste ut.