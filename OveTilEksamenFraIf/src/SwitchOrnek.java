import javax.swing.*;

public class SwitchOrnek {
    public static void main(String[] args) {
        double tall1=Double.parseDouble(JOptionPane.showInputDialog("Skriv tall 1"));
        String regneart=JOptionPane.showInputDialog(" + , - , * , / ");
        double tall2=Double.parseDouble(JOptionPane.showInputDialog("Skriv tall 2"));
        double sum=0;


        switch (regneart){
            case "+":
                sum = tall1 + tall2;
                break;
            case "-":
                sum = tall1-tall2;
                break;
            case "*":
                sum = tall1 * tall2;
                break;
            case "/":
                sum = tall1 /tall2;
                break;
            default:
                sum=0;
                break;
        }

        /*if(regneart.equals("+")){
            sum=tall1+tall2;
        } else if (regneart.equals("-")) {
            sum= tall1-tall2;
        } else if (regneart.equals("*")) {
            sum=tall1*tall2;
        } else if (tall2!=0) {
            if (regneart.equals("/")) {
                sum=tall1/tall2;
        } }*/
        System.out.println(tall1+" "+regneart+" "+tall2+" = "+sum);
    }
}
