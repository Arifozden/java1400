import java.util.Arrays;

public class ArrayFonksiyonlar {
    public static void main(String[] args) {
        int[] liste2 = {1,4,6,2,7,8};
        //Arrays.sort(liste2);
        for (int verdi : liste2){
            System.out.print(verdi+" ");
        }
        int[] liste3 = {1,4,6,2,7,8};
        if(Arrays.equals(liste2,liste3)){
            System.out.println("Arrayene er like!");
        }
        else{
            System.out.println("Arrayene er IKKE like!");
        }

        int indeks=Arrays.binarySearch(liste2,8);
        System.out.println(indeks);
    }
}

