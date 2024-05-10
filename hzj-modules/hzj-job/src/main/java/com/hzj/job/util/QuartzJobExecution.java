package com.hzj.job.util;

import org.quartz.JobExecutionContext;

import com.hzj.job.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author hzj
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
