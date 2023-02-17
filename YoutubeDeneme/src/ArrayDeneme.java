public class ArrayDeneme {
    public static void main(String[] args) {
        int [] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i=0; i<arr1.length ; i++){
            System.out.print("array 1 elemanlari "+arr1[i]+" ");
        }





        int [] arr2 = new int [5];

        arr2[0]= 1;
        arr2[1]= 2;
        arr2[2]= 3;
        arr2[3]= 4;
        arr2[4]= 5;

        System.out.println("Array 2 birinci elemani : "+    arr2[0]);
        System.out.println("Array 1 ikinci elemani : "+arr1[1]);

    }
}
