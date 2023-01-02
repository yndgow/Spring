package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/*
 * 날짜 : 2023/01/02
 * 이름 : 김지홍
 * 내용 : 스프링 IoC 실습하기
 * 
 * IoC(Inversion of Control)
 *  - 자바 객체를 생성하고 객체 사이의 의존관계를 스프링 컨테이너로 처리하는 개념
 *  - DI(Dependency Injection)는 IoC 구현하는 기술
 */
@Service
public class IocMain {
	public static void main(String[] args) {
		
		// Ioc를 확용하지 않은 객체 생성
		TV t1 = new LgTV();
		TV t2 = new SamsungTV();
		
		t1.powerOn();
		t1.chUp();
		//t1.soundUp();
		
		t2.powerOn();
		t2.chUp();
		//t2.soundUp();
		System.out.println("-----------------------------");
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		TV ltv = (LgTV)ctx.getBean("ltv");
		TV stv = (SamsungTV)ctx.getBean("stv");
		
		ltv.powerOn();
		ltv.chDown();
		ltv.soundDown();
		
		stv.powerOn();
		stv.chDown();
		stv.soundDown();
		
	}
}
