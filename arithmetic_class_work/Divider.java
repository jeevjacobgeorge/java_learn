package arithmetic_class_work;

public class Divider extends Arithmatics {

	@Override
	public String process(int x, int y) {
		// TODO Auto-generated method stub
		return format(x/y,ResultFormatter.UNDERSCORE);
	}

}
