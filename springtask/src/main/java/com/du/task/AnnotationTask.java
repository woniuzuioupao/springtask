package com.du.task;
import com.du.util.MyUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/**
 * 类描述:springtask基于注解的任务
 *
 * @author hanyan
 * @createdtime 2018/6/21
 */
@Component
public class AnnotationTask {

    @Scheduled( cron="* * * * * ?")
    public void doTask(){
        System.out.println("#################################");
        System.out.println("#################################");
        Long x = null;
        x.toString();
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        System.out.println("com.du.task:注解方式!!!时间："+MyUtil.stringTime());
    }
}
