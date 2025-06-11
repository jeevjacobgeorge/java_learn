package bookshop;

public class Catalogue implements BookShopService {
	private static final int MAX_BOOKS = 100;
	private Book[] books = new Book[MAX_BOOKS];
	private int count = 0;
	
	public void addBook(Book book) {
		if (count < MAX_BOOKS) {
			books[count++] = book;
		} else {
			System.out.println("Catalogue is full");
		}
	}
	@Override
	public Book[] searchByAuthor(String name) throws AuthorNotFoundException {
		Book[] result = new Book[MAX_BOOKS];
		int resultCount = 0;
		
		for(int i = 0; i < count; i++) {
			if (books[i].getAuthor().getName().equalsIgnoreCase(name)) {
				result[resultCount++] = books[i];
			}
		}
		if (resultCount==0) throw new AuthorNotFoundException("No books found for author:"+name);
		return trimArray(result,resultCount);
	}

	@Override
	public Book[] serachByCategory(String category) throws BookNotFoundException {
		Book[] result = new Book[MAX_BOOKS];
		int resultCount = 0;
		
		for(int i = 0; i < count; i++) {
			if (books[i].getCategory().equalsIgnoreCase(category)) {
				result[resultCount++] = books[i];
			}
		}
		if(resultCount == 0) throw new BookNotFoundException("No books found for this category"+category);
		return trimArray(result,resultCount);
	}

	@Override
	public Book[] searchByPublisher(String name) throws PublisherNotFoundException {
		Book[] result = new Book[MAX_BOOKS];
		int resultCount = 0;
		
		for(int i = 0; i < count; i++) {
			if (books[i].getPublisher().getName().equalsIgnoreCase(name)) {
				result[resultCount++] = books[i];
			}
		}
		if(resultCount == 0) throw new PublisherNotFoundException("No books found for this category"+name);
		return trimArray(result,resultCount);
	}
	
	private Book[] trimArray(Book[] orginal , int size) {
		Book[] trimmed = new Book[size];
		for( int i = 0; i < size; i++) {
			trimmed[i] = orginal[i];
		}
		return trimmed;
	}

}
