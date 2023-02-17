import javax.swing.*;

public class ifYas {
    public static void main(String[] args) {
        String input =  JOptionPane.showInputDialog("Fyll inn alderen din : " );
        int alder = Integer.parseInt(input);

        if(alder < 13){
            JOptionPane.showMessageDialog(null,"Du er bare et barn");
        }
        if (alder >= 13 && alder < 18){
            JOptionPane.showMessageDialog(null,"Du er ungdom");
        }
        if (alder >= 18 && alder < 70){
            JOptionPane.showMessageDialog(null,"Du er voksen");
        }
        if (alder >= 70){
            JOptionPane.showMessageDialog(null,"Du er pensjonist");
        }
        String ut = alder >= 18 ? "Du er voksen" : "Du er ikke voksen";
        JOptionPane.showMessageDialog(null,ut);
    }
}
