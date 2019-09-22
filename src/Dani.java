//https://codingbat.com/prob/p192082
import java.util.Scanner;

public class Dani {
    public static void main(String[] args) {
        System.out.println(icyHot(101,-3));

        System.out.println(frontBack("danielle"));

        System.out.println(delDel("HDELELLO"));
        System.out.println(delDel("ddelog"));
        System.out.println(delDel("howdy"));
        System.out.println(delDel("del"));

        System.out.println(front22("apple"));
        System.out.println(front22("a"));
        System.out.println(front22("mississippi"));

        countVowelsAndConst();

    }
    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0 || temp2 > 100 && temp1 < 0);

    }

    //Given a string, return a new string where the first and last chars have been exchanged.

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    //Given a string, if the string "del" appears starting at index 1,
    // return a string where that "del" has been deleted. Otherwise, return the string unchanged.

    public static String delDel(String str) {
        if(str.length()>=4 && str.substring(1,4).equalsIgnoreCase("del")){
            return str.substring(0,1)+str.substring(4);
        }else {
            return str;
        }
    }
    //Given a string, take the first 2 chars and return the string with the 2 chars addedat both the front and back,
    // so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.



    public static String front22(String str) {

        if(str.length()<2) {
            return str.substring(0)+str+str.substring(0);
        }else if(str.isEmpty()){
            return str;
        }else{
            String firstTwo = str.substring(0,2);
            return firstTwo + str + firstTwo;
        }
    }



    //Vowel and consonant count in class bonus

    public static void countVowelsAndConst () {
        System.out.println("Please enter a word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toLowerCase();
        int l = word.length();
        int vowels = 0, con=0;
        for(int i =0; i < l; i++){
            char c = word.charAt(i);

            if(c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
                vowels++;
            }else {
                con++;
            }
        }

        System.out.println("vowel count: " + vowels);
        System.out.println("consonant count: " + con);
        System.out.println("do you want to enter another word? Y/N");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("y")) {
            countVowelsAndConst();
        }
    }

}


