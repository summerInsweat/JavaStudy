package comclass.dataclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author summersweat
 */
public class Date01 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
