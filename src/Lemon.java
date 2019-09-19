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

        System.out.println("Enter a sentence: ");
        String userInput = input.nextLine();
        int vowels = 0, consonants = 0;

        userInput = userInput.toLowerCase();
        for(int i = 0; i < userInput.length(); ++i)
        {
            char ch = userInput.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);





//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants
        //-------------------- BONUS 3----------------



    }
}
