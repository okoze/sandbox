package sample.func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import sample.func.SampleB.Message;
import sample.fw.Context;

@Component
public class Mainclass {

	@Autowired
	SampleB b;

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app.xml")) {
			Mainclass m = context.getBean(Mainclass.class);
			m.go();
		}

	}

	public void go() {

		b.start(new Message(), new Context());
	}

}
