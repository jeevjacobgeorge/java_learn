package bookshop;

public interface BookShopService {
	Book[] searchByAuthor(String name) throws AuthorNotFoundException;
	Book[] serachByCategory(String name) throws BookNotFoundException;
	Book[] searchByPublisher(String name) throws PublisherNotFoundException;	
}
