class Bil11{
    private String farge;
    public void settFarge(String fargen){
        farge=fargen;
    }
    public String hentFarge(){
        return farge;
    }
}

public class Bil1 {
    public static void main(String[] args) {
        Bil11 nyBil=new Bil11();
        nyBil.settFarge("blå");
        String bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er "+bilFargen);
    }
}
