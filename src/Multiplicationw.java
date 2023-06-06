public class Multiplicationw {


    public static void CalMultiplication(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int result = i * j;
                System.out.print(result + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        CalMultiplication(10);
        //System.out.println("Hello world!");
    }
}
