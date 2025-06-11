package bookshop;

public class Book {
	private String title;
	private String category;
	private Author author;
	private Publisher publisher;
	public Book(String title, String category, Author author, Publisher publisher) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public Author getAuthor() {
		return author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", category=" + category + ", author=" + author + ", publisher=" + publisher
				+ "]";
	}
	
}
