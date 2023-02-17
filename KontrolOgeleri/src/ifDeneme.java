import javax.swing.*;

public class ifDeneme {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Yasiniz?"));
        if(alder>=18){
            System.out.println("Du er myndig.");
        }
        else {
            System.out.println("Du er ikke myndig.");
        }
    }
}
