import java.util.Arrays;

public class StandardDeviation {
   public static  double sd=0;

    public static double CalAverage(int [] arr){
        int sum=0;
        double ave=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            ave = sum/arr.length;
        }
        //System.out.println("Average: "+ave);
        return ave;
    }
    public static double Calsd(int [] arr){
        double sd=0;
        double ssum=0;
        double ave=CalAverage(arr);
        for(int i=0; i<arr.length; i++){
            ssum=ssum+(arr[i]-ave)*(arr[i]-ave);
        }
        sd=Math.sqrt((ssum)/(arr.length);
        return sd;
    }

    public static void main(String[] args) {
       int [] myarray={10,4,6,7,9,50,80,57,55,75};

       CalAverage(myarray);
        System.out.println("Standard deviation:"+Calsd(myarray));

    }
}
