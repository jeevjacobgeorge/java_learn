package arithmetic_class_work;

public class Subtractor extends Arithmatics {

	@Override
	public String process(int x, int y) {
		 return format(x-y,ResultFormatter.ASTERIK);
	}


}
