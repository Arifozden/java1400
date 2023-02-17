import javax.swing.*;

class Vind{
    private double vindHastighet;
    public Vind(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    // her skal det inn en konstruktør for å sette vindhastigheten

    public double getVindhastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
      if(vindHastighet>=120){
          return true;
      }
      return false;
    }

    public boolean erVindstille() {
        if(vindHastighet<=2){
            return true;
        }
        return false;
    }

    public double getKnop() {
        double knop=vindHastighet/1.852;
        return knop;
    }
    public int getBeaufort() {
        int beaufort=(int)(Math.pow((vindHastighet/3.01),0.6666)+0.5);
        return beaufort;
    }
}

public class oppgave6 {
    public static void main(String[] args) {
double vind=Double.parseDouble(JOptionPane.showInputDialog("Skriv inn vindhastighet"));
        Vind v=new Vind(vind);
    }
}

//Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet i km/t om det er stille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).
//
//Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).  Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i. Bruk gjerne Math.pow funksjonen for å foreta beregningen.
//
//Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.
//
//Nedenfor illustreres hvordan klassen og metodene skal se ut:
/*public class Vind {
    private double vindHastighet = 0.0;

    // her skal det inn en konstruktør for å sette vindhastigheten

    public double getVindhastighet() {
        // sett inn kode her
    }

    public boolean erOrkan() {
        // sett inn kode her
    }

    public boolean erVindstille() {
        // sett inn kode her
    }

    public double getKnop() {
        // sett inn kode her
    }

    public int getBeaufort() {
        // sett inn kode her
    }
}
//Lag så kode for å teste ut metodene via en main-metode.
 */