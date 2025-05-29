package assignments;

public class Multiplicator extends Arithmatics {

	@Override
	public String process(int x, int y) {
		return format(x*y,ResultFormatter.ASTERIK);	
	}

}
