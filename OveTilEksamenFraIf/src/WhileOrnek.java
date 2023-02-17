import javax.swing.*;

public class WhileOrnek {
    public static void main(String[] args) {
        int sum = 0;
        int antall=0;

        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall, null eller negativt avslutter "));
        while (tall > 0){
            sum = sum + tall;
            antall=antall+1;

            tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall, null eller negativt avslutter "));
        }
        System.out.println("Summen av tallene er : "+sum);
        double gjennomsnitt=(double) sum/(double) antall;
        System.out.println("Antall skrevet tall "+antall);
        System.out.println("Gjennomsnittet av tallene er "+gjennomsnitt);
    }
}
