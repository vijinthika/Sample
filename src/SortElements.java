import java.util.Arrays;

public class SortElements {


    public static void main(String[] args) {
        String [] myarray ={"Apple","Mango","Orange","Pineapple","Banana"};
        Arrays.sort(myarray);
        for(int i=0; i<myarray.length; i++) {
            System.out.println(myarray[i]);
        }
        //System.out.println("Hello world!");
    }
}
