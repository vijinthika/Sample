import java.util.Arrays;

public class LargerSecond {
    public static void calLargerSecond(int []a){
        //int max=0;
        int secondmax=0;
        int [] b=new int[a.length];
          Arrays.sort(a);
        for(int i=0;  i<a.length; i++){
            b[i]=a[i];

        }
        secondmax=b[b.length-2];
        System.out.println(secondmax);
    }
    public static void main(String[] args)
    {
        int []b={60,20,70,40,50};
       /* for(int i=0; i<b.length; i++) {
            System.out.println(b[i]);
        }*/
        System.out.println("Second largest Number: ");
       calLargerSecond(b);
    }
}
