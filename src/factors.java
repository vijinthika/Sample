public class factors {
    public static void Calfactors(int n) {
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
                System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        Calfactors(60);
        //System.out.println("Hello world!");
    }
}
