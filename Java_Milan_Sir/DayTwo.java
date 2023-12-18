import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a month (1-12): ");
        int monthNum = num.nextInt();
        String month = "";
        String season = "";
        switch (monthNum) {
            case 1:
            month = "January";
            break;
            case 2:
            month = "February";
            break;
            case 3:
            month = "March";
            break;
            case 4:
            month = "April";
            break;
            case 5:
            month = "May";
            break;
            case 6:
            month = "June";
            break;
            case 7:
            month = "July";
            break;
            case 8:
            month = "August";
            break;
            case 9:
            month = "September";
            break;
            case 10:
            month = "October";
            break;
            case 11:
            month = "November";
            break;
            case 12:
            month = "December";
            break;
            default:
            System.out.println("Invalid Month Number Entered.");
        }
            
        switch (monthNum) {
            case 12:
            season = "winter";
            break;
            case 1:
            season = "winter";
            break;
            case 2:
            season = "winter";
            break;
            case 3:
            season = "spring";
            break;
            case 4:
            season = "spring";
            break;
            case 5:
            season = "spring";
            break;
            case 6:
            season = "summer";
            break;
            case 7:
            season = "summer";
            break;
            case 8:
            season = "summer";
            break;
            case 9:
            season = "autumn";
            break;
            case 10:
            season = "autumn";
            break;
            case 11:
            season = "autumn";
            break;
            default:
            System.out.println("Invalid month number");
        }
            System.out.println(month + " is in " + season);
        
    }
}
