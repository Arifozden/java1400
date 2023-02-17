public class ArrayDeneme1 {
    public static void main(String[] args) {
        int [] liste = new int[4];
        liste [0]=1;
        liste [1]=44;
        liste [2]=532;
        liste [3]=-6;
        String ut ="Her er tallene i listen : ";
        ut+=liste[0]+" ";
        ut+=liste[1]+" ";
        ut+=liste[2]+" ";
        ut+=liste[3]+" ";
        System.out.println(ut);
        ut = "Her er tallene i listen : ";
        for (int i=0 ; i<liste.length; i++){
            ut += liste[i]+" ";
        }
        System.out.println(ut);
    }
}
