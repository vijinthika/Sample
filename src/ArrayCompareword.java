import java.util.Arrays;

public class ArrayCompareword {
    public static void check(char []a,char []b) {
       if( Arrays.equals(a,b)){
           System.out.println("word is same");
       }else{
           System.out.println("word is not same");
       }

    }

    public static void main(String[] args)
    {
     char [] myarrayone = {'m','o','t','h','e','r'};
        char [] myarraytwo = {'f','a','t','h','e','r'};
        check(myarrayone,myarraytwo);
    }
}
