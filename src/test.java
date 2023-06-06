public class test {
    public static int countnum(int []a,int x){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                count++;
        }
        System.out.println("occurs"+count+"times");
        return count;

    }

    public static void Uniq(int[]a){
        int x = 0;
         boolean isUnique = false;
        for (int i = 0; i < a.length; i++)
        {

            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
                if (!isUnique) {
                    x = a[i];
                    System.out.print(x);
                    countnum(a, x);
                }


            //System.out.print( a[i] + " ");


        }

    }







    public static void main(String[] args)
    {
        int [] a={9,2,1,4,5,2,1,9,3,4};
        Uniq(a);
    }



}
