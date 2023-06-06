public class vowels {
    //public int count=0;
    public static boolean Califvowel(char letter){
        boolean isvowel = false;
        if(letter=='a'|| letter=='A'){
            isvowel=true;
            System.out.println(letter+" is an Vowel");
        }else if(letter=='e'|| letter=='E'){
            System.out.println(letter+" is an Vowel");
            isvowel=true;
        }else if(letter=='i'|| letter=='I'){
            System.out.println(letter+" is an Vowel");
            isvowel=true;
        }else if(letter=='o'|| letter=='O'){
            System.out.println(letter+" is an Vowel");
            isvowel=true;
        }else if(letter=='u'|| letter=='U'){
            System.out.println(letter+" is an Vowel");
            isvowel=true;
        }else{
            System.out.println(letter+" is an Consonant");
        }
        return isvowel;
    }

    public static void Calvowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char letter=str.charAt(i);
            if(Califvowel(letter)==true){
                count++;
            }
        }
        System.out.println("No of vowels:"+count);
        System.out.println("No of consonant:"+(str.length()-count));
    }



    public static void main(String[] args) {
        Calvowel("ALPHABET");

          // Califvowel('u');

          /* char letter='A';
           switch(letter){
               case 'a':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'A':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'e':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'E':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'i':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'I':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'o':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'O':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'u':
                   System.out.println(letter+"is an Vowel");
                   break;
               case 'U':
                   System.out.println(letter+"is an Vowel");
                   break;
               default:
                   System.out.println(letter+"is a Consonant");
           }*/
        //System.out.println("Hello world!");
    }
}
