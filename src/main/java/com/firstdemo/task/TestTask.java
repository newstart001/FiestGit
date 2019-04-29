package com.firstdemo.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
	private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");
	
	//定义每过三秒执行任务
//	@Scheduled(fixedRate = 3000)
	//表达式指定周期（表达式地址：corn.qqe2.com）
	@Scheduled(cron = "1-10 * * * * ? ")
	public void report() {
		System.out.println("现在时间：" + dataFormat.format(new Date()));
	}
}
