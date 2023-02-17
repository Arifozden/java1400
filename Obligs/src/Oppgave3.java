import javax.swing.*;

class UnikeTall {


    // Deklarasjon av array for lagring av tilfeldige heltall
    int[] lagring;


    /* Konstruktør som mottar arrayets lengde som parameter og
      oppretter arrayet.  */
    public UnikeTall(int lengde) {
        lagring = new int[lengde];

        fyllArrayMedTilfeldigeTall();
    }


   /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */

    private boolean finnesIArray(int tall) {
        for (int i = 0; i < lagring.length; i++) {
            if (lagring[i] == tall) {
                return true;
            }
        }
        return false;
    }

    private void fyllArrayMedTilfeldigeTall() {
        int i = 0;
        while (i < lagring.length) {
            int tilfeldigTall = (int) (Math.random() * 900 + 100);
            if (!finnesIArray(tilfeldigTall)) {
                lagring[i] = tilfeldigTall;
                i++;
            }
        }

    }

    private int minst() {
        int minstVerdi = lagring[0];
        for (int i = 1; i < lagring.length; i++) {
            if (lagring[i] < minstVerdi) {
                minstVerdi = lagring[i];
            }
        }
        return minstVerdi;

    }

    private int størst() {
        int størstVerdi = lagring[0];
        for (int i = 1; i < lagring.length; i++) {
            if (lagring[i] > størstVerdi) {
                størstVerdi = lagring[i];
            }
        }
        return størstVerdi;
    }

    private double gjennomsnitt() {
        double sum = 0;
        for (int value : lagring) {
            sum += value;
        }
        return sum / lagring.length;
    }

    public void visInfo() {
        String utMelding = "";
        for (int i = 0; i < lagring.length; i++) {
            utMelding += lagring[i] + " ";
            if ((i + 1) % 8 == 0) {
                utMelding += "\n";
            }
        }
        utMelding += "\n\n";

        utMelding += "Minste tall er " + minst() + "\n" + "Største tall er " + størst() + "\nGjennomsnittverdien er " + String.format("%.2f", gjennomsnitt()) + "\n";
        JOptionPane.showMessageDialog(null, utMelding);

   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */

        // Metode som finner og returnerer det minste tallet i arrayet.

        // Metode som finner og returnerer det største tallet i arrayet.

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
UnikeTall tall=new UnikeTall(65);
tall.visInfo();
    }
}
//Det skal lages et program som trekker tilfeldige tall og lagrer dem i en array.
// Hvor mange tall som skal trekkes er avhengig av arrayets lengde, som er parameter i klassens konstruktør.
// (Hele arrayet skal fylles) Programmet skal imidlertid bare lagre de tall som ikke er trukket allerede.
// Dvs. arrayet skal inneholde KUN ÈN forekomst av hvert tall.
// Alle tall som trekkes skal være i intervallet 100 til 999, begge grenser inkludert.
//
//Når alle tallene er generert og lagret i arrayet, skal programmet finne den største, minste og gjennomsnittlige verdien av tallene i arrayet.
//Til slutt skal programmet skrive ut, i en meldingsboks, tallene i arrayet, samt resultatet av beregningene som er beskrevet over: