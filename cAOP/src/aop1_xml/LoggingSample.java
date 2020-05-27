package aop1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingSample {
	
	public void before(JoinPoint p)
	{
		System.out.println("before : 메소드 호출전----------------");
	}
	
	//public void (JoinPoint p)
	//public Object around(ProceedingJoinPoint point)
	
	public void afterReturning(JoinPoint p)
	{
		System.out.println("afterReturning : 메소드 호출 후 예외 발생이 없는 경우");
	}

}
