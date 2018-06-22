package com.du.task;

import com.du.util.MyUtil;
import org.springframework.stereotype.Service;

/**
 * 类描述:spring的task 配置文件方式的任务
 *
 * @author hanyan
 * @createdtime 2018/6/21
 */
@Service("configurationTask")
public class ConfigurationTask {

    public void doTask(){
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("com.du.task:配置文件方式!!!时间："+MyUtil.stringTime());
    }

}
