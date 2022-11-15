package sample.func.impl;
import org.springframework.stereotype.Component;

import sample.func.SampleB;
import sample.fw.Context;

@Component
public class SampleBImpl implements SampleB {

	public Context start(Message m, Context c) {

		System.out.println("start");
		System.out.println("start２");
		System.out.println("start３");
		System.out.println("start4");

		return c;
	}

}
