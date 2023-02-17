import javax.swing.*;

class Bok{
    public String tittel;
    public String forfatter;
    public double pris;

    public double regnUtRabatt(double prosent){
        double rabatt = pris*(prosent/100);
        return rabatt;
    }
    public void skrivUtBok(){
        String ut = "Her er bokinformasjonen : \n";
        ut+="Tittel : "+tittel+" \n";
        ut+="Forfatter : "+forfatter+" \n";
        ut+="Pris : "+pris+" \n";
        JOptionPane.showMessageDialog(null, ut);
    }
}

public class KitapOrnek {
    public static void main(String[] args) {
        String tittel = JOptionPane.showInputDialog("Skriv inn boktittel");
        String forfatter = JOptionPane.showInputDialog("Skriv inn forfatter");
        double pris=Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen"));
        Bok bok1=new Bok();
        bok1.tittel=tittel;
        bok1.forfatter=forfatter;
        bok1.pris=pris;
        String person = JOptionPane.showInputDialog("Student eller ansatt?");
        if (person.equals("Ansatt")){
            double rabatt=bok1.regnUtRabatt(15);
            bok1.pris = bok1.pris-rabatt;
        }
        bok1.skrivUtBok();
    }
}
