class Person{
    private String navn;
    private String personnummer;
    private int alder;
//    <Skriv en konstruktør for attributtene>

    public Person(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

//    <Skriv en toString() metode>
public String toString(){
        return "Person : \n"+"Navn : "+navn+"\nPersonnummer : "+personnummer+"\nAlder : "+alder+"\n";
}
}
class Pasient extends Person{
    private String diagnose;
    //    <Skriv en konstruktør>
    public Pasient(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }

//    <Skriv en toString() metode>
    public String toString(){
        return "Pasient : \n"+super.toString()+"Diagnose : "+diagnose+"\n";
    }
}
class Lege extends Person{
    public Pasient [] pasienter = new Pasient[100];

    Lege(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);

    }
    public String toString(){
        String ut="";
        for(Pasient enPasient : pasienter){
            if(enPasient!=null){
                ut+=enPasient;
            }
        }
        return "Lege : \n"+super.toString()+ut;
    }

    //    <Opprett et pasient-array med 100 plasser>
//    <Opprett en konstruktør>
//    <Skriv en toString() metode>

}
public class Oppgave2 {
    public static void main(String[] args) {
        Pasient ole =new Pasient("Ole", "12345678900",70,"Øye");
        Pasient kari=new Pasient("Kari", "12312345688",72, "Beina");
//        <Opprett to pasienter med deres egne diagnoser>
       Lege lege1=new Lege("Ole Olsen", "12345678910", 40);
//        <Opprett en lege>
//        <Legg de to pasientene inn i legens pasient-array>
        lege1.pasienter[0]=ole;
        lege1.pasienter[1]=kari;
        System.out.println(lege1);
       
//        <Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>
    }
}