public class OppgaveArray6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean sum = false;
        if (array1.length != array2.length) {
            System.out.println("arrayene har ikke samme length");
        } else {
            for (int i = array1[0]; i < array1.length; i++) {
                for (int j = array2[0]; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        sum = true;
                    }
                }
            }
        }
        if (sum = true) {
            System.out.println("arrayene er like");
        }
    }}
//Oppgave 6
//Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.