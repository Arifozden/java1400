import javax.swing.*;

public class ifBoolean {
    public static void main(String[] args) {
        boolean myndig;
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Yasiniz"));
        if(alder>17){
            myndig=true;
        }
        if (myndig=true){
            System.out.println("Du kan ta førerkort");
        }
        else {
            System.out.println("Du kan ikke ta førerkort");
        }
    }
}
