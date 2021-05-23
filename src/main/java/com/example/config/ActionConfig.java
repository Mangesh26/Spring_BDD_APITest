package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.Action.Action;

@Component
public class ActionConfig {
	
	public Action action() {
		return new Action();
	}
}
