import javax.swing.*;

public class ifLogiskeOperator {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Yasiniz?"));
        if(alder>12 && alder<18){
            System.out.println("Du er tenåring");
        }
        else if(alder<12||alder>18){
            System.out.println("Du er ikke tenåring");
        }

    }
}
