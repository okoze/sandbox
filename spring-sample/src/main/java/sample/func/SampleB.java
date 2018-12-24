package sample.func;
import sample.fw.SampleA;

public interface SampleB extends SampleA<SampleB.Message> {

	class Message extends BaseMessage {
		String name;
	}

}
