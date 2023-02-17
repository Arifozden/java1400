class Personalia1{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Personalia1(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }
    public String toString(){
        return "Personalia = {" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnr='" + telefonnr + '\'' +
                '}';
    }
}
class Student1{
    private Personalia personalia;
    private String studentnr;

    public Student1(Personalia personalia, String studentnr) {
        this.personalia = personalia;
        this.studentnr = studentnr;
    }
    public String toString(){
        return "Student {" +
                personalia +
                ", studentnr='" + studentnr + '\'' +
                '}';
    }
}

class Ansatt1{
    private Personalia personalia;
    private String tittel;

    public Ansatt1(Personalia personalia, String tittel) {
        this.personalia = personalia;
        this.tittel = tittel;
    }
    public String toString(){
        return "Ansatt {"+personalia+", tittel= "+tittel+'\''+'}';
    }
}
public class Oppgave3 {
    public static void main(String[] args) {
Personalia per =new Personalia("Per Hansen", "Askerveien 82","22334455");
Personalia kari=new Personalia("Kari Olsen","Osloveien 78","66778899" );
Ansatt perHansen=new Ansatt(per,"Lektor");
Student kariOlsen=new Student(kari, "S992233");
        System.out.println(perHansen);
        System.out.println(kariOlsen);
    }
}
