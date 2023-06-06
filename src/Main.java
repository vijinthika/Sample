public class Main {
    public static int a=5;
    public static int b=6;
    public static int c=0;
    public static void SwapInteger(){
        int d=5;
        int e=10;
        int temp=0;
        temp=d;
        d=e;
        e=temp;
        System.out.println("d:"+d+" "+"e:"+e);

    }
    public static void Swapwithouttemp(){
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("a:"+a+" "+"b:"+b);
    }
    public static void main(String[] args)
    {
        Swapwithouttemp();
        SwapInteger();
    }
}