package oblig1;

import java.text.DecimalFormat;

public class alanHesapla {
    private static double beregnAreal(double radius){
        double areal=Math.PI*Math.pow(radius,2);
        return areal;
    }
    private static double beregnOmkrets(double radius){
        double omkrets=2*Math.PI*radius;
        return omkrets;
    }
    private static double beregnDiameter(double radius){
        double diameter=2*radius;
        return diameter;
    }

    public static void main(String[] args) {
        double radius = 23.5;
        double areal = beregnAreal(radius);
        double omkrets = beregnOmkrets(radius);
        double diameter = beregnDiameter(radius);
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Arealet til en sirkel med radius "+radius+" er "+df2.format(areal));
        System.out.println("Omkretsen til en sirkel med radius "+radius+" er "+df2.format(omkrets));
        System.out.println("Diameteren til en sirkel med radius "+radius+" er "+df2.format(diameter));
    }
}
