import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class AsalSayiKontolu {
    public static void main(String[] args) {
        int n =Integer.parseInt(showInputDialog("Skriv inn et heltall :"));
        int c = 0;
        String primtall = " er et primtall!";
        for (int i = 1; i <= n; i++) {
            if(n % i==0) {
                c++;
            }
            if(c > 2) {
                primtall = " er ikke et primtall";
                break; // gå ut av for-løkken det er ikke et primtall
            }
        }
        showMessageDialog(null,"Tallet "+n + primtall);
    }
}
