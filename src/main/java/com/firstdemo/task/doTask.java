package com.firstdemo.task;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doTask {
	
	@Autowired
	private AsyncTask asyncTask;
	
	@RequestMapping("/test1")
	public String test1() throws Exception {
		long start = System.currentTimeMillis();
		Future<Boolean> a = asyncTask.doTask1();
		Future<Boolean> b = asyncTask.doTask2();
		
		while(!a.isDone() || !b.isDone()) {
			if (a.isDone() && b.isDone()) {
				break;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("任务全部完成 总耗时：" + (end -start) + "毫秒");
		return "任务全部完成 总耗时：" + (end -start) + "毫秒";
	}
}
