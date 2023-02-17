class Bil2{
    private String farge;
    private int HK;

    public Bil2(String farge, int HK){
        this.farge=farge;
        this.HK=HK;
    }
    public void setFarge(String farge){
        this.farge = farge;
    }
    public String getFarge(){
        return farge;
    }
    public void setHK(int HK){
        if(HK>0){
        this.HK = HK;
    }}
    public int getHK(){
        return HK;
    }
}

public class KonstruktorOrnek {
    public static void main(String[] args) {
        Bil2 volvo = new Bil2("rød", 234);
        int HK=volvo.getHK();
        String farge=volvo.getFarge();
        System.out.println("Bilens farge er "+farge+" og den har "+HK+ "   HK.");
    }
}
