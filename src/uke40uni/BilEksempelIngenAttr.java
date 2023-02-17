package uke40uni;

class Bil2{
    public double rekkevidde2(double tank1, double forbruk1){
        double rekkevidde2=tank1/forbruk1;
        return rekkevidde2;
    }
}
public class BilEksempelIngenAttr {
    public static void main(String[] args) {
        Bil2 volvo=new Bil2();
        double rekkevidde2=volvo.rekkevidde2(80 , 0.8);
        System.out.println("Rekkevidden til bilen er ");
        System.out.println(rekkevidde2+ " mil");

    }
}
