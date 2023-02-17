import java.util.ArrayList;

public class OppgaveArray2_3 {
    public static void main(String[] args) {
        int [] liste = {1,2,3,4,5,6,7,8,9};


        ArrayList<Integer> liste2 = new ArrayList<>();
        for (int i : liste){
            liste2.add(i);
        }
        for (int i =0;i<liste2.size();i++){
            System.out.println(liste2.get(i));
        }}
    }

//Oppgave 3
//Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
// Skriv kode for å konvertere dette til et ArrayList.
// Skriv så ut denne ArrayListen.