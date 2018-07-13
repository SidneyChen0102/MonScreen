package com.asiainfo.oss.Timer;

import org.quartz.*;


public class Timerjob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobKey jobKey= jobExecutionContext.getJobDetail().getKey();
        Scheduler scheduler = jobExecutionContext.getScheduler();

        System.out.print("");
    }
}
