package bookshop;

public class BookNotFoundException extends BookShopException {

	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String message) {
		super(message);
	}

}
