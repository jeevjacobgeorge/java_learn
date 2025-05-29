package assignments;

public interface ResultFormatter {
	char UNDERSCORE = '_';
	char ASTERIK = '*';
	
	String format(int result,char formatSymbol);
}
