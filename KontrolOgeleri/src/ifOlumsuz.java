import javax.swing.*;

public class ifOlumsuz {
    public static void main(String[] args) {
        int alder=Integer.parseInt(JOptionPane.showInputDialog("Yasiniz?"));
        if(alder != 12){
            System.out.println("Du er ikke 12 år gammel");
        }
    }
}
