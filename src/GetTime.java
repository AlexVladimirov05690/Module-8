import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetTime {
    public String getNowTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        String result = dateFormat.format(calendar.getTime());
        return result;
    }
}
