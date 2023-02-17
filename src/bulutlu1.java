public class bulutlu1 {
    public static void main(String[] args) {
        int a= 10;
        int b= 5;
        try {
            System.out.println(a / b);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Kod devam ediyor");
    }
}
