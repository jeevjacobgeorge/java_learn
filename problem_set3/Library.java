package problem_set3;

public class Library {
	public String name;
	public class Book{
		public String name;
		public String author;
		public Book(String name,String author) {
			this.name = name;
			this.author = author;
		}
		public void display() {
			System.out.println("Book Name:"+name+" Author:"+author);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library mylibrary = new Library();
		Library.Book b = mylibrary.new Book("Java Guide","Jeev");
		b.display();
		
	}

}
