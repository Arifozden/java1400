class Person1{
    private String navn;
    private String personnummer;
    private int alder;

    public Person1(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    public String toString() {
        return "Person: \n" +
                "Navn : " + navn + "\n" +
                "Personnummer: " + personnummer +"\n" +
                "Alder: " + alder+"\n";
    }
}

class Lege1 extends Person1{
    public Pasient1[] pasienter1 = new Pasient1[100];

    public Lege1(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);
    }

    public String toString(){
        String ut="";
        for(Pasient1 enPasient1 : pasienter1){
            if(enPasient1 != null){
                ut += enPasient1;
            }
        }
        return "Lege : \n"+
                super.toString()+ut;
    }
}
class Pasient1 extends Person1{
    public String diagnose;

    public Pasient1(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }

    public String toString() {
        return "Pasient : \n" +
                super.toString()+
                "Diagnose : " + diagnose + "\n";
    }
}

public class Oppgave2Hoca {

    public static void main (String[] args) {
        Pasient1 ole = new Pasient1("Ole","01019323456",23,"Diabetes");
        Pasient1 kari = new Pasient1("Kari","01029012345",32,"Migrene");
        Lege finn1 = new Lege("Finn","12128012345",40);
        finn1.pasienter1[0]=ole;
        finn1.pasienter1[1]=kari;
        System.out.println(finn1);
    }
}
