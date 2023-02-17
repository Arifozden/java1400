class BensinKjøp{
    private String sted;
    private String type;
    private double antallLiter;
    private double prisPerLiter;
    private String tidspunkt;

    public BensinKjøp(String sted1, String type1, double antallLiter1, double prisPerLiter1, String tidspunkt1){
        this.sted=sted1;
        this.type=type1;
        this.antallLiter=antallLiter1;
        this.prisPerLiter=prisPerLiter1;
        this.tidspunkt=tidspunkt1;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAntallLiter() {
        return antallLiter;
    }

    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisPerLiter() {
        return prisPerLiter;
    }

    public void setPrisPerLiter(double prisPerLiter) {
        this.prisPerLiter = prisPerLiter;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }
    public double finnTotalPrisen(){
        return antallLiter*prisPerLiter;
        //Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
    }
}
public class oppgave3 {
    public static void main(String[] args) {
        BensinKjøp b1 = new BensinKjøp("Strømmen", "bensin 98", 15.5, 24.26, "12.30");
        double prisen = b1.finnTotalPrisen();
        System.out.println(String.format("%.2f", prisen));

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
//Klassen skal ha en konstruktør som initialiserer alle attributtene.
// Lag også get/set metoder for disse. Lag så en metode finnTotalPrisen.
// Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall.
// Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
//
//Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.