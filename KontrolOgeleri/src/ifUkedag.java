import javax.swing.*;

public class ifUkedag {
    public static void main(String[] args) {
        String ukedag= JOptionPane.showInputDialog("Hvilken dag er i dag?" +
                "\nmandag" +
                "\ntirsdag\n" +
                "onsdag\n" +
                "torsdag\n" +
                "fredag\n" +
                "lørdag\n" +
                "søndag");
        if(ukedag.equals("mandag")){
            System.out.println("Det er første dag i uken");
        }
        else if(ukedag.equals("tirsdag")){
            System.out.println("Det er andre dag i uken");
        }
        else if(ukedag.equals("onsdag")){
            System.out.println("Det er tredje dag i uken");
        }
        else if(ukedag.equals("torsdag")){
            System.out.println("Det er fjerde dag i uken");
        }
        else if(ukedag.equals("fredag")){
            System.out.println("Det er femte dag i uken");
        }
        else if(ukedag.equals("lørdag") ||ukedag.equals("søndag")){
            System.out.println("HELG!");
        }
        else {
            System.out.println("Du har skrevet feil");
        }

    }

}
