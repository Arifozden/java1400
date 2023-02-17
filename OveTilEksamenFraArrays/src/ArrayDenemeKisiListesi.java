
import java.util.Arrays;

class Person{
    public String navn;
    public int alder;
}

public class ArrayDenemeKisiListesi {

    public static void endrePerson(Person[] innListe, String innNavn){
        innListe[0].navn = innNavn;
    }

    public static void main(String[] args) {
        int [] liste = {1,3,6,8};
        liste[1] = 23;
        for (int i=0; i < liste.length; i++){
            System.out.print(liste[i]+" ");
        }

        String [] navn = {"Ole","Line","Per"};
        navn[2] = "Kari";
        for (String etNavn : navn){
            System.out.print(etNavn+" ");
        }

        Person[] personListe = new Person[3];

        Person ole = new Person();
        ole.navn = "Ole";
        ole.alder = 23;

        personListe[0] = ole;

        Person line = new Person();
        line.navn = "Line";
        line.alder = 19;

        personListe[1] = line;

        System.out.println();

        endrePerson(personListe,"Per");

        for (int i=0; i<personListe.length; i++){
            if(personListe[i]!=null){
                System.out.println(personListe[i].navn+" "+personListe[i].alder);
            }
        }

        for (Person enPerson : personListe){
            if(enPerson!=null){
                System.out.println(enPerson.navn + " "+enPerson.alder);
            }
        }}}