package sample.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import sample.func.BaseMessage;
import sample.fw.Context;

@Aspect
@Component
public class LogAspect {

	@Before("execution(sample.fw.Context sample.func.impl.*Impl.start(sample.func.BaseMessage+, sample.fw.Context)) && args(msg, context)")
	public void before(JoinPoint jp, BaseMessage msg, Context context) {
	    System.out.println("AOPクラスで、メソッド実行「前」に引数を取得します。");

	    System.out.println("引数msgの値です。 : " + msg);
	    System.out.println("引数contextの値です。 : " + context);

	}

}
