package uke40uni;
class Bil3{
    public static double rekkevidde3(double tank3, double forbruk3){
        double rekkevidde3=tank3/forbruk3;
        return rekkevidde3;
    }

}
public class Bil3MedStatiskMetode {
    public static void main(String[] args) {
        double rekkevidde3=Bil3.rekkevidde3(80, 0.8);
        System.out.println("Rekkevidden til bilen er");
        System.out.println(rekkevidde3+" mil");
    }
}
