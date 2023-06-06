public class UniqueElement {
   /* public static int FindUniqueElement(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == x)
                count++;
        return count;
    }*/

   /* public static int findDistinct(int[] b) {
        int c = 0;
        for (int k = 1; k < b.length; k++)
            for (int j = 0; j < k; j++)
                if (b[k] != b[j])
                    c = b[j];
        return c;
    }*/
   public static void listUniqueValues(int[] sortedArray) {
       int current = sortedArray[0];
       int count = 0;//

       System.out.println("Unique Values:");
       //System.out.println(current + " (occurs " + count + " times)");
       //System.out.print(current );
       for (int i = 0; i < sortedArray.length; i++) {
          // System.out.print(current );
           if (sortedArray[i] == current) {
               count++;

           } else {
               System.out.println(current+" (occurs " + count + " times)");
               current = sortedArray[i];
               count = 1;
           }
       }
       System.out.println(current+" (occurs " + count + " times)");
   }



    public static void main(String[] args) {
        int[] SortedArray = {1,1,1,1, 2, 2, 3, 4, 5, 5, 6, 6};

        listUniqueValues(SortedArray);


    }
}