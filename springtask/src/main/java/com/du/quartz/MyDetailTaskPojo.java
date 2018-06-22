package com.du.quartz;

import com.du.util.MyUtil;

/**
 * 类描述:quartz不需要继承基类方式的任务
 *
 * @author hanyan
 * @createdtime 2018/6/21
 */
public class MyDetailTaskPojo {

    public void doTask(){
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("com.du.quartz:不继承基类方式!!!时间："+MyUtil.stringTime());
    }
}
