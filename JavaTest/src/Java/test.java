package Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

    public static void main(String[] str) {
        String day = "2018-07-31";
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert date != null;
        c.setTime(date);
        int day1 = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day1 - 1);
        String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        System.out.println(dayAfter);

//        String str1 = "hello";
//        String str2 = "he" + new String("llo");
//        System.out.println(str1 == str2);

//        String str1 = "123";
//        String str2 = "123";
//        System.out.println(str1 == str2);
    }

}
