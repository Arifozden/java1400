package OppgaverKlasser1;

import javax.swing.*;

/*Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
*/
class Person1{
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fodselsar;
    public int alder(){
        return 2022 - fodselsar;
    }

    public void skrivUtPerson(int alder){
        String ut= "Navm : "+navn+"\n"+"Adresse : "+adresse+"\n+ Telefonnr : "+telefonnr+"\n Alder : "+alder+" år.";
        JOptionPane.showMessageDialog(null,ut);

    }
}

public class oppgave4 {
    public static void main(String[] args) {
        Person1 person1=new Person1();
        String navn=JOptionPane.showInputDialog("Navn : ");
        String adresse=JOptionPane.showInputDialog("Adresse : ");
        String telefonnr=JOptionPane.showInputDialog("Telefonnr : ");
        String innfodselsar=JOptionPane.showInputDialog("Fødselsår : ");
        int fodselsar=Integer.parseInt(innfodselsar);

        person1.navn=navn;
        person1.adresse=adresse;
        person1.telefonnr=telefonnr;
        person1.fodselsar=fodselsar;

        int alder= person1.alder();

        person1.skrivUtPerson(alder);

    }


}
