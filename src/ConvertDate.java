import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //prompt user for data
        System.out.print("Enter a date (mm/dd/yyyy): ");
        String dateRaw = in.nextLine();
        String [] dateArr = dateRaw.split("/");

        // declare variables
        String month = dateArr[0];
        String date = dateArr[1];
        String year = dateArr[2];

        /* use switch statement to check month */
        String monthStr ="";
        switch (month) {
            case "01":
                month = "January";
                break;
            case "02":
                month = "February";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "Aril";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "Jun";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;
            default:
                month = "Invalid Month";
        }

        //check for correct day input
        if (Integer.parseInt(date) < 0 || Integer.parseInt(date) > 31) {
            date = "Invalid date";
        } else if (Integer.parseInt(date) > 28 && month == "February") {
            date = "Invalid date";
        }else date = dateArr[1];


        //print the date
        System.out.println("It is " + month + " " + date + ", " + year);

    }
}
