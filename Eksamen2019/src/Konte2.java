class Skatt {
    private String navn;
    private String adresse;
    private double lønn;
    private double skatt;

    public Skatt(String navn, String adresse, double lønn) {
        this.navn = navn;
        this.adresse = adresse;
        this.lønn = lønn;
    }
    public void beregn(){
        if(lønn<50000){
            skatt=0;
        } else if (lønn>=50000&&lønn<=150000){
            skatt=lønn*0.25;
        } else if (lønn>150000) {
            skatt=lønn*0.35;
        }
    }
    public String toString(){
        return navn+", "+adresse+"\nLønn : "+lønn+" Skatt : "+skatt+"\n";
    }
}
    public class Konte2 {
    public static void main(String[] args) {
        Skatt per=new Skatt("Per Hansen", "Osloveien 82 0150 Oslo",400000);
        per.beregn();
        System.out.println(per);
    }
}
//Det skal lages kode for en klasse kalt Skatt. Den skal ha følgende attributter
//- navn (tekst)//- adresse (tekst)//- lønn (desimaltall)//- skatt (desimaltall)
//
//Det også lages en metode i denne klassen som heter beregn. Denne metoden skal så beregne
//skatten ut i fra lønnen etter følende formel:
//Ved inntekter mindre enn 50.000 skal det ikke betales skatt.
//Ved inntekter mellom 50.000 og 150.000 skal det betales 25% skatt på hele lønnen.
//Inntekter over 150.000 skal det betales 35 % skatt på hele lønnen.
//Metoden skal så sette den beregnede skatten i skatte-attributten. Det betyr at metoden ikke skal motta
//noe eller returnere noe.
//
//En metode toString() skal også lages. Denne skal formatere resultatet slik:
//Per Hansen, Osloveien 82 0150 Oslo
//Lønn : 400000.0 Skatt : 140000.0
//
//Kod klassen og metodene under. Bruk en konstruktør. Det er ikke nødvendig å kode get/set-metoder.
//Kod også kall til disse for å skrive resultatet til System.out.