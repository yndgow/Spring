package kr.co.ch02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.co.ch02")
public interface TV {
	public void powerOn();
	public void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
}
