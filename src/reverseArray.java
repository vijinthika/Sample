public class reverseArray {
    public static void reverseArray(char a[],int n){
        char []b =new char[n];
        int j=n;
        for(int i=0; i<n; i++){
            b[j-1]=a[i];
            j--;

        }
        System.out.println("Reversed Array: ");
        for(int k=0; k<n; k++){
            System.out.println(b[k]);
        }


    }
    public static void main(String[] args)
    {
        char [] myarray={'a','5','b','c','d'};
        reverseArray(myarray,myarray.length);

    }
}
