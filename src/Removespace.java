public class Removespace {

    public static void removespace(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                System.out.print(str.charAt(i));
            }


        }

    }

    public static void main(String[] args) {


        String str = "(some extra spaces )";
        removespace(str);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }

        String result = sb.toString();
        System.out.println();
        System.out.println("result: "+result);

    }
}
