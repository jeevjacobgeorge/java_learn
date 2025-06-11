package bookshop;

public class Main {

	public static void main(String[] args) {
	
		Book b1 = new Book("1984","Dystopi",new Author("George"),new Publisher("Penguin Books","London"));
		Book b2 = new Book("Deep Work","Improvement",new Author("George"),new Publisher("Arihant","Delhi"));
		Catalogue c = new Catalogue();
		c.addBook(b1);
		c.addBook(b2);
		
		try {
			System.out.println("Search by Author");
			for (Book b: c.searchByAuthor("George")) {
				System.out.println(b);
			}
			
			System.out.println("Search by Publisher");
			for (Book b: c.searchByPublisher("Penguin Books")) {
				System.out.println(b);
			}
			
			System.out.println("Search by Category");
			for (Book b: c.serachByCategory("Improvement")) {
				System.out.println(b);
			}
		} catch(BookShopException e ) {
			System.err.println(e.getMessage());
		}
		
	}

}
