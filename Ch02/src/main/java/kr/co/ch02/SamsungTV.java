package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV implements TV{
	
	@Autowired
	private Speaker spk;
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("SamsungTV chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("SamsungTV chDown...");
	}

	@Override
	public void soundUp() {
		spk.soundUp();
	}

	@Override
	public void soundDown() {
		spk.soundDown();
		
	}
}
