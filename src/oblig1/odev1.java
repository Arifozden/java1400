package oblig1;

import javax.swing.*;



public class odev1 {

    public static double pi = Math.PI;

    public static double capHesaplama(double yaricap){
        double cap = yaricap*2;
        return cap;
    }

    public static double cevreHesaplama(double yaricap){
        // double pi = Math.PI;
        double cevre = 2*pi*yaricap;

        return cevre;
    }

    public static double alanHesaplama(double yaricap) {
        double rUstu2 = Math.pow(yaricap, 2);
        double alan = pi*rUstu2;

        return alan;
    }

}


class Odev2 {

    public static void main(String args[]) {

        String girYaricap = JOptionPane.showInputDialog("Yaricapi yaziniz");
        double yaricap = Double.parseDouble(girYaricap);

        double cevre = odev1.cevreHesaplama(yaricap);

        double alan = odev1.alanHesaplama(yaricap);

        double cap = odev1.capHesaplama(yaricap);




        System.out.println("Alan : "+alan);
        System.out.println("Cevre : "+cevre);
        System.out.println("Cap : "+cap);
    }

}