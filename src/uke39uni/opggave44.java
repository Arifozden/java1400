package uke39uni;

public class opggave44 {
    public static void main(String[] args) {
        double radius=20;
        double omkretsen=2*3.14*radius;
        String omkretsMedToDesimaler=String.format("%.2f" , omkretsen);
        System.out.println("Omkretsen av en sirkel med "+radius+" cm som radius blir "+omkretsMedToDesimaler+" cm.");
    }
}
