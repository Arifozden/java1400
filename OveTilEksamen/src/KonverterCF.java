import javax.swing.*;

class Konverter{
    public static double fraCelsius(double graderCelsius){
        double fahrenheit = graderCelsius*9/5+32;
        return fahrenheit;
    }
    public static double fraFahrenheit(double graderFahrenheit){
        double celsius = (graderFahrenheit-32)*5/9;
        return celsius;
    }
}

public class KonverterCF {
    public static void main(String[] args) {
        String valg = JOptionPane.showInputDialog("Konverter fra C eller F?");
        if (valg.equals("C")){
            double celsius = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn grader Celsius"));
            String ut= celsius+" grader Celsius er "+ Konverter.fraCelsius(celsius)+ " Fahrenheit";
            JOptionPane.showMessageDialog(null, ut);
        }
        if (valg.equals("F")){
            double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn grader Fahrenheit"));
            String ut=fahrenheit+ "grader Fahrenheit er "+Konverter.fraFahrenheit(fahrenheit)+ " Celsius";
            JOptionPane.showMessageDialog(null,ut);
        }
    }
}
