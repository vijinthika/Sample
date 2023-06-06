public class LinearBinarysearch {
    public static int Linearsearch(int [] arr,int x)
    {
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x)
                    System.out.println(x+"is the"+i+"index");
                    return i;
            }
        //System.out.println(x+"is the"+i+"index");
            return -1;
        }
    public static int binarysearch(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            else if (x > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            System.out.println(x+"is the"+mid+"index");
        }
        return -1;
    }





    public static void main(String[] args) {
        int [] myarray={20,15,40,60,50};

        //System.out.println("Hello world!");
    }
}
