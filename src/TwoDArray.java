public class TwoDArray {

    public static void main(String[] args)
    {
      String [][] myarrayTable={{"thavee","0778976786","Kokuvil"},{"john","0778978686","Kilinochi"},{"peter","0778997786","Kandy"}};
        for (String[] myarray : myarrayTable) {
            for (String value : myarray) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
