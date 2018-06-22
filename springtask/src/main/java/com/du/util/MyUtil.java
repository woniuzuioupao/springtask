package com.du.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 类描述:
 *
 * @author hanyan
 * @createdtime 2018/6/21
 */
public class MyUtil {

    public static String stringTime(){
        LocalDateTime arrivalDate  = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String landing = arrivalDate.format(format);
        return landing;
    }
}
