class Fag{
    private String navn;
    private String år;
    private Student[] studenter;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getÅr() {
        return år;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }
    public String toString(){
        String ut="Fag : "+navn+", år : "+år+"\n";
        for(Student enStudent : studenter){
            if(enStudent!=null){
                ut+=enStudent+"\n";
            }
        }
        return ut;
    }
}
class Student{
    private String navn;
    private String studNr;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }
    public String toString(){
        return "Student : Navn="+navn+", StudNr="+studNr;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Student [] liste = new Student[10];
        Student kari=new Student("Kari Olsen", "S234556");
        Student ole=new Student("Ole Hansen", "S356734");
        liste[0]=kari;
        liste[1]=ole;
        Fag programmering=new Fag("Programmering","2020",liste);
        System.out.println(programmering);
    }
}
//Det er definert to klasser, Fag og Student. Se koden til venstre.
//
//Lag et program som inneholder disse to klassene og en main-metode.
//
//Lag konstruktører og get/set metoder for Fag og Student-klassene.
//
//Lag toString() metoder i Fag- og Student-klassene slik at man får følgende ut på System.out når
//det opprettes et array med 10 plasser i faget og det legges inn to studenter og man skriver ut et
//fag:
//
//Fag : Programmering, år : 2020
//Student : Navn=Kari Olsen, StudNr=S234556
//Student : Navn=Ole Hansen, StudNr=S356734
//
//Skriv en main-metode for å få det overstående ut via System.out.