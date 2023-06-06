public class IndexDestination {
    //int []arr ={5,10,15,20,25};
    public static void SwapIndex(int[]a,int pointer,int destination){
       int c =0;
       c=a[pointer];
        a[pointer]=a[destination];
        a[destination]=c;
          for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int []arr ={5,10,15,20,25};
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("After swapping:");
        SwapIndex(arr,3,1);
    }
}
