class BensinKjøp{

    private String bensinstasjonensSted;
    private String typeBensin;
    private double antallLiterFylt;
    private double prisenPerLiter;
    private String tidspunktFylt;

    public BensinKjøp(String bensinstasjonensSted, String typeBensin, double antallLiterFylt, double prisenPerLiter, String tidspunktFylt){
        this.bensinstasjonensSted = bensinstasjonensSted;
        this.typeBensin = typeBensin;
        this.antallLiterFylt = antallLiterFylt;
        this.prisenPerLiter = prisenPerLiter;
        this.tidspunktFylt = tidspunktFylt;
    }

    public String getBensinstasjonensSted() {
        return bensinstasjonensSted;
    }

    public void setBensinstasjonensSted(String bensinstasjonensSted) {
        this.bensinstasjonensSted = bensinstasjonensSted;
    }

    public String getTypeBensin() {
        return typeBensin;
    }

    public void setTypeBensin(String typeBensin) {
        this.typeBensin = typeBensin;
    }

    public double getAntallLiterFylt() {
        return antallLiterFylt;
    }

    public void setAntallLiterFylt(double antallLiterFylt) {
        this.antallLiterFylt = antallLiterFylt;
    }

    public double getPrisenPerLiter() {
        return prisenPerLiter;
    }

    public void setPrisenPerLiter(double prisenPerLiter) {
        this.prisenPerLiter = prisenPerLiter;
    }

    public String getTidspunktFylt() {
        return tidspunktFylt;
    }

    public void setTidspunktFylt(String tidspunktFylt) {
        this.tidspunktFylt = tidspunktFylt;
    }
    public void finnTotalPrisen(){
        double prisen = antallLiterFylt*prisenPerLiter;
        String prisToDesimaler =String.format("%.2f", prisen);
        System.out.println("Det kostet i "+bensinstasjonensSted+" "+prisToDesimaler+ " klokke "+tidspunktFylt);
    }
}

public class OppgaveClass2_3 {
    public static void main(String[] args) {
        BensinKjøp kjøp1=new BensinKjøp("Oslo", "95", 50, 0.8, "12:45");
        kjøp1.finnTotalPrisen();
        BensinKjøp kjøp2 = new BensinKjøp("Lillestrøm", "98", 50, 1.2, "18:45");
        kjøp2.finnTotalPrisen();
    }
}
//Oppgave 3
//Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:
//
//Bensinstasjonens sted (en streng)
//Type bensin (en streng)
//Antall liter fylt (et desimaltall)
//Prisen pr. liter (et desimaltall)
//Tidspunkt fylt (en streng)
//Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
// Lag så en metode finnTotalPrisen.
// Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall.
// Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
//
//Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.