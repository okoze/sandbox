package sample.func.impl;
import org.springframework.stereotype.Component;

import sample.func.SampleB;
import sample.fw.Context;

@Component
public class SampleBImpl implements SampleB {

	public Context start(Message m, Context c) {

		System.out.println("start");

		return c;
	}

}
