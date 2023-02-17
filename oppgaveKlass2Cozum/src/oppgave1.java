import javax.swing.*;

class Person{
    private String fornavn, etternavn, adresse, telefonnr;

    public Person(String fornavn2, String etternavn2, String adresse2, String telefonnr2){
        this.fornavn = fornavn2;
        this.etternavn = etternavn2;
        this.adresse = adresse2;
        this.telefonnr = telefonnr2;
    }
    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }
public void skrivUt(){
        String ut = "Fornavn : "+fornavn+
                "\nEtternavn : "+etternavn+
                "\nAdresse : "+adresse+
                "\nTelefonnummer : "+telefonnr;
    JOptionPane.showMessageDialog(null, ut);
}

}
public class oppgave1 {
    public static void main(String[] args) {
        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavn");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavn");
        String innAdresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String innTelefonnr = JOptionPane.showInputDialog("Skriv inn telefonnummer");

        Person p1 = new Person(innFornavn, innEtternavn, innAdresse, innTelefonnr);
        p1.skrivUt();
    }
}
//Oppgave 1
//Lag en klasse «Person» med følgende private attributter:
//
//fornavn
//etternavn
//adresse
//telefonnr
//Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.
//
//Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.
//
//Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.