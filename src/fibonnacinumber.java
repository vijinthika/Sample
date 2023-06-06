public class fibonnacinumber {
    public static void Calfibonnacinum(int n){
        int fib1 =1;
        int fib2 =1;
        int fib3=0;
        System.out.print(fib1+" ");
        System.out.print(fib2+" ");
        for(int i=3; i<=n; i++){

            fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;

            System.out.print(fib3+" ");


        }
    }


    public static void main(String[] args) {
        Calfibonnacinum(8);
        //System.out.println("Hello world!");
    }
}
