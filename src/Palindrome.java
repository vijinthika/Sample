public class Palindrome {
    public static boolean isPalindrome(String str){
        boolean ans=false;
            String rev="";
            for(int i=str.length()-1; i>=0;i--)
            rev=rev+str.charAt(i);

            if(str.equals(rev))
                //System.out.println(str+" is a Palindrome word");
                ans=true;
            else{
                //System.out.println(str+" is not a Palindrome word");
                ans=false;
            }
        return ans;
    }
    public static void main(String[] args)
    {
        String a="ACCA";
       // String a="thavee";
       // isPalindrome(a);
        System.out.println(isPalindrome(a));

    }
}
