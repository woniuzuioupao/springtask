package allTest;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 类描述:
 *
 * @author hanyan
 * @createdtime 2018/6/21
 */
public class Java8TimeTest {

    @Test
    public void test(){
        LocalDateTime arrivalDate  = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String landing = arrivalDate.format(format);
        System.out.println(arrivalDate);
        System.out.println(landing);
        System.out.println(arrivalDate);
    }
    @Test
    public void te() {

        Long X = new Random().nextInt(10000)+5000L;
        System.out.println(X);
    }
    @Test
    public void tenull() {
        List<String> x = null;
        x.toString();
        System.out.println(x);
    }


}
