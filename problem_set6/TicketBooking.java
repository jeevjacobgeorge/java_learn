package problem_set6;
//Simulate a real-world task (e.g., booking tickets) where
//multiple threads try to access a shared resource. Add
//proper synchronization.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BookingOffice {
	private int left = 10;
	
	public synchronized boolean bookTicket(int seatToBook) {
		if (left >= seatToBook) {
			left-=seatToBook;
			return true;
		}
		return false;
	}
}
class BookingThread extends Thread{
	private BookingOffice office;
	private int seatToBook;
	public BookingThread(BookingOffice office,int seatToBook) {
		this.seatToBook = seatToBook;
		this.office = office;
	}
	
	@Override
	public void run() {
		boolean status = office.bookTicket(seatToBook);
		System.out.println(Thread.currentThread().getName()+" Booking status:"+status);
	}
}
public class TicketBooking {
    public static void main(String[] args) {
    	BookingOffice office = new BookingOffice();
    	
    	BookingThread t1 = new BookingThread(office,4);
    	BookingThread t2 = new BookingThread(office,4);
    	BookingThread t3 = new BookingThread(office,4);
    	BookingThread t4 = new BookingThread(office,4);
    	ExecutorService service = Executors.newFixedThreadPool(2);
    	service.execute(t1);
    	service.execute(t2);
    	service.execute(t3);
    	service.execute(t4);
    	service.shutdown();
    }
}