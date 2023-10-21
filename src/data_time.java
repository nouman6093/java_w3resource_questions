import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class data_time {
    //print current system date and time:
    public static void main(String[] args){
        //SimpleDateFormat is built in function
        SimpleDateFormat variable = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //getting date
        Date currentDate = new Date();
        String formattedDate = variable.format(currentDate);
        System.out.print("Current Date and Time: "+formattedDate);
    }
}