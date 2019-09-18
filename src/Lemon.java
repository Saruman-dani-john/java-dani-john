import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Lemon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //-------------------- BONUS 1----------------
        System.out.println("Enter a Date: MM/DD/YYYY");
        String dateInput = input.nextLine();
        String[] arrOfDates = dateInput.split("/", 3);
        String month = new DateFormatSymbols().getMonths()[Integer.parseInt(arrOfDates[0]) - 1];
        String day = arrOfDates[1];
        String year = arrOfDates[2];

        System.out.format("%s %s, %s",month, day, year);

        //-------------------- BONUS 2----------------
        //-------------------- BONUS 3----------------



    }
}
