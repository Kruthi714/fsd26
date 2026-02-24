package com.test;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
public class ConnectionManager {
	private boolean isConnected=false;
	@PostConstruct
	public void connect() {
		System.out.println("Connecting to external server");
		isConnected=true;
		System.out.println("Connection established isConnected");
	}
	@PreDestroy
	public void disconnect() {
		System.out.println("Disconnecting from external");
		isConnected=false;
		System.out.println("Connection closed isConnected : ");
	}
	
	public void operation() {
		if(isConnected) {
		System.out.println("performing operation with active connection");
	}
		else {
		System.out.println("operation failed");
	}
	}
}
