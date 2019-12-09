package com.nt.listner;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitoringListener implements ApplicationListener {
	private long start,end;
	public IOCContainerMonitoringListener() {
		System.out.println("IOCContainerMonitoringListener:0-param constructor");
	}

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("IOCContainerMonitoringListener.onApplicationEvent()"+event.toString());
		if(event.toString().contains("Refreshed")){
			start=System.currentTimeMillis();
		}
		else if(event.toString().contains("Closed")) {
			end=System.currentTimeMillis();
			System.out.println("ApplicationContext container is in running mode  for  "+ (end-start)+" ms");
		}
			
	}
}


