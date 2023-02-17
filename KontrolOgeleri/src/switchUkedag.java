import javax.swing.*;

public class switchUkedag {
    public static void main(String[] args) {
        String ukedag= JOptionPane.showInputDialog("Hvilken dag er i dag?" +
                "\nmandag" +
                "\ntirsdag\n" +
                "onsdag\n" +
                "torsdag\n" +
                "fredag\n" +
                "lørdag\n" +
                "søndag");
        switch (ukedag){
            case  "mandag":
                System.out.println("første dag i uken");
                break;
            case "tirsdag":
                System.out.println("andre dag i uken");
                break;
            case "onsdag":
                System.out.println("tredje dag i uken");
                break;
            case "torsdag":
                System.out.println("fjerde dag i uken");
                break;
            case "fredag":
                System.out.println("femte dag i uken");
                break;
            case "lørdag":
            case "søndag":
                System.out.println("HELG!");
                break;
            default:
                System.out.println("ikke ukedag");
                break;
        }
    }
}
