package com.asiainfo.oss.Timer;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class TimeScheduler {
    public static void main(String[] args) throws SchedulerException {
//        创建jobDetail实例，将该实例与TimeJob绑定
        JobDetail jobDetail = JobBuilder.newJob(Timerjob.class)
                .withIdentity("Timerjob", "1")
                .usingJobData("message","hello1" ).usingJobData("Float",3.14F).build();

        //创建一个Trigger实例，定义该job立即执行，并且每隔两秒中重复执行一次
        Trigger triger = TriggerBuilder.newTrigger().withIdentity("mytriger", "1")
                .startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

         //创建scheduler实例
        SchedulerFactory sfact=new StdSchedulerFactory();
        Scheduler scheduler=sfact.getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,triger);
    }
}
