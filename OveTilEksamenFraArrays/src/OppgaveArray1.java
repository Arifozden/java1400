import java.util.Arrays;

public class OppgaveArray1 {
    public static void main(String[] args) {
        int [] array2={1,2,3,4,5,6,7,8,9};
        int [] array1=new int[9];
        for (int i=1;i<10;i++){
            System.out.println(i);

        }
        int [] array3=new int[9];
        array3[0]=1;
        array3[1]=2;
        array3[2]=3;
        array3[3]=4;
        array3[4]=5;
        array3[5]=6;
        array3[6]=7;
        array3[7]=8;
        array3[8]=9;

        if(Arrays.equals(array3,array2)){
            System.out.println("arrayene er like");
        };
        System.out.println(array2[2]);
        System.out.println(array2[5]);
        System.out.println(array3[2]);
        System.out.println(array3[5]);
    }
}
//Oppgave 1
//Definer følgende helttalls-array: 1,2,3,4,5,6,7,8,9.
//Skriv ut element nummer 3 og 6 med System.out