class Temperatur{
    public static double gjennomsnitt(double [] innArray){
        double sum=0;
        for (int i=0;i<innArray.length;i++){
            sum+=innArray[i];
        }
        return sum/innArray.length;

    }
    public static double minimum(double [] innArray){
        double minimum=innArray[0];
        for (int i = 1; i <innArray.length ; i++) {
            if(innArray[i]<minimum){
                minimum=innArray[i];
            }
        }
        return minimum;
    }
}

public class Konte3 {
    public static void main(String[] args) {
        double [] temp= {-0.4 , -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0};
        System.out.println("Gjennomsnittet av temperaturene er "+Temperatur.gjennomsnitt(temp));
        System.out.println("Minimum av temperaturene er "+Temperatur.minimum(temp));
    }
}
//Gitt et array med følgende gjennomsnittstemperaturer for januar de siste 10 årene for Oslo:
//-0.4 , -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0. Det kan velges om man ønsker å implementere
//med et  array eller en array-list.
//
//Lag en klasse kalt Temperatur. Lag statiske metoder for
//
//a) Regne ut gjennomsnittstemperaturen arrayet. Metoden (kalt gjennomsnitt) skal ta arrayet inn og
//returnere gjennomsnittet. Det skal brukes en løkke.
//
//b) Finne minimumstemperaturen. Metoden (kalt minimum) skal ta arrayet inn og returnere den minste
//verdien i arrayet. Det skal brukes en løkke for å finne verdien.
//
//c) Skriv så kode for å opprette arrayet, kalle metodene og skrive ut resultatet i System.out.