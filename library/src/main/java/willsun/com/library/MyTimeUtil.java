package willsun.com.library;

import java.text.SimpleDateFormat;

/**
 * @Author:Create by Mr.w
 * @Date:2018/12/13 16:21
 * @Description:
 */
public class MyTimeUtil {
    public static String getTimes(long times, String pattern) {
        return new SimpleDateFormat(pattern).format(times);
    }
}
