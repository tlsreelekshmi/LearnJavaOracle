import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcepts {

    public static void main(String [] args) {

        Date today = new Date();
        System.out.println(today); //output - Mon Mar 18 01:13:32 IST 2024

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/YYYY");
        String todayDate = simpleDateFormat.format(today);
        System.out.println(todayDate);
    }
}
