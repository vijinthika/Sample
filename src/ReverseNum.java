public class ReverseNum {
    public static void Reverse(int num){

        int digit=num%10;
        int rev=0;
        rev=rev*10+digit;
        System.out.print(rev);
    }

    public static void main(String[] args) {
            int number = 12345;
                int reversedNumber = 0;

                while (number != 0) {
                    int remainder = number % 10;
                    reversedNumber = reversedNumber * 10 + remainder;
                    number = number / 10;
                }

                System.out.println("Reversed number: " + reversedNumber);


        //System.out.println("Hello world!");
    }
}
