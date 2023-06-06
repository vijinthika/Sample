public class factorial {
    public static void Calfactorial(int m){
        int fact=1;
        for(int i=1; i<=m; i++ ){
            fact=fact*i;
        }
        System.out.println("factorial:"+fact);
    }


    public static void main(String[] args) {
      Calfactorial(3);
        //System.out.println("Hello world!");
    }
}
