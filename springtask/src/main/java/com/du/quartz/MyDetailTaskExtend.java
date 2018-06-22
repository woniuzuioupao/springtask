package com.du.quartz;

import com.du.util.MyUtil;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 类描述:quartz继承基类方式的任务
 *
 * @author hanyan
 * @createdtime 2018/6/21
 */
public class MyDetailTaskExtend extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("com.du.quartz:继承基类方式!!!时间："+MyUtil.stringTime());
    }
}
