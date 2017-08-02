package calculateDays;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/*
 * This application can calculate the date lived after a date of birth
 * @author mahderf
 */
public class Datecalculate {

    public static void main(String[]args)
    {
        //a scanner to take the inputs
        Scanner scan=new Scanner(System.in);
        //a setting a date format saying how we want the date to appear
        DateFormat df=new SimpleDateFormat("MM/dd/yyyy");
        //declaring a date object of the date function
        Date date= new Date();
        long diff=0;

        System.out.println("Curent date:" + df.format(date));
        System.out.println("Enter your date of birth in'MM dd yyyy'format");

        String bdate =scan.nextLine();
        String today=df.format(date);

        //parse the dates entered to a date format from a string and calculates the difference between the two dates
        try {
            Date date1=df.parse(bdate);
            Date date2=df.parse(today);
            diff=date2.getTime()-date1.getTime();
            System.out.println("Days lived:"+ TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
