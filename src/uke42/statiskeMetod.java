package uke42;
import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;

public class statiskeMetod {
    private static double alanHesapla(double yaricap){
        double alan=Math.PI * Math.pow(yaricap,2);
        return alan;
    }
    public static void main(String[] args) {
double yaricap=Double.parseDouble(showInputDialog("Yaricapi giriniz"));
double alan=alanHesapla(yaricap);
        DecimalFormat df2=new DecimalFormat(".##");
        System.out.println("Yaricapi "+yaricap+" olan bir dairenin alani "+ df2.format(alan));
    }
}
