package calculateDays;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Datecalculate {

    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        DateFormat df=new SimpleDateFormat("MM/dd/yyyy");
        Date date= new Date();
       // LocalDate bdate= LocalDate.of(11,16,2000);

        System.out.println(df.format(date));



    }


}
