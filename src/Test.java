import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {
        String a = "20171116";
        System.out.println(Test.formatDate(a));
        long st = System.currentTimeMillis();
        String s = "未还金额=当期应还本金%s+当期服务费%s";
        String f = String.format(s, 123, 50);
        long end = System.currentTimeMillis();

        System.out.println(end - st);
        System.out.println(f);

    String orig = "未还金额=当期应还本金{0}+当期服务费{1}";

        System.out.println(String.format(orig,123,456));
        System.out.println(MessageFormat.format(orig,123,456));
    String g="";


    }

    public static String formatDate(String date) throws ParseException {
        long s = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date d = sdf.parse(date);
        Map<String, String> a = new HashMap<String, String>();
        long e = System.currentTimeMillis();
        System.out.println(e - s);
        return new SimpleDateFormat("yyyy年MM月dd日 EEEE").format(d);
    }
}
