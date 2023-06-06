public class MultiplicationTable {
    public static void CalMultiplicationtable(int n){

        for(int i=1; i<=n; i++){
            System.out.println(" ");
            System.out.print("\t");
            for(int j=1; j<=n; j++){

                System.out.print("\t"+i*j);
                System.out.print("\t");
            }
        }
    }
    public static void main(String[] args) {
       // System.out.print(" ");
        CalMultiplicationtable(10);

       // System.out.println("Hello world!");
    }
}
