import java.text.DateFormatSymbols;
import java.util.Scanner;
public class Lemon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //-------------------- BONUS 1----------------
//        System.out.println("Enter a Date: MM/DD/YYYY");
//        String dateInput = input.nextLine();
//        String[] arrOfDates = dateInput.split("/", 3);
//        String month = new DateFormatSymbols().getMonths()[Integer.parseInt(arrOfDates[0]) - 1];
//        String day = arrOfDates[1];
//        String year = arrOfDates[2];
//
//        System.out.format("%s %s, %s",month, day, year);

        //-------------------- BONUS 2----------------

//        System.out.println("Enter a sentence: ");
//        String userInput = input.nextLine();
//        int vowels = 0, consonants = 0;
//
//        userInput = userInput.toLowerCase();
//        for(int i = 0; i < userInput.length(); ++i)
//        {
//            char ch = userInput.charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i'
//                    || ch == 'o' || ch == 'u') {
//                ++vowels;
//            }
//            else if((ch >= 'a'&& ch <= 'z')) {
//                ++consonants;
//            }
//        }
//        System.out.println("Vowels: " + vowels);
//        System.out.println("Consonants: " + consonants);

        // Method Calls from bonus practice on methods

//        fizzBuzzLoop(1);


    }

    //----- Practice Problems https://codingbat.com/java/Warmup-1 --------

//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile || !aSmile == !bSmile;
    }

//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public static int sumDouble(int a, int b) {
        int sum = 0;
        if(a == b) {
            sum = (a + b) * 2;
        }else {
            sum = a + b;
        }
        return sum;
    }

//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public static int diff21(int n) {
        int abs = 21 - n;
        if(n > 21){
            abs = (n - 21) * 2;
        }
        return abs;
    }

//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

//    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
    public static String changePi(String str) {
        return str.replace("pi", "3.14");
    }

    // FizzBuzz recursion
    public static int fizzBuzzLoop(int i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            if (i == 100) {
                return 0;
            }
            return fizzBuzzLoop(i+1);
    }


}
