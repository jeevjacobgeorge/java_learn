package assignments;

public abstract class Arithmatics implements ResultFormatter{
	public int j =3; //here
	public abstract String process(int x,int y);
	
	@Override
	public String format(int result, char formatSymbol) {
		// TODO Auto-generated method stub
		return formatSymbol + String.valueOf(result) + formatSymbol;
	}
}
