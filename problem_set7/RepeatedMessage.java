package problem_set7;

import java.util.Timer;
import java.util.TimerTask;

//6. Use Timer and TimerTask to Print a Message Every 3 Seconds (5 Times)

public class RepeatedMessage {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int count = 0;
			public void run() {
				count+=1;
				System.out.println("Hello");
				if(count>=5) {
					timer.cancel();
				}
			}
		};
		timer.scheduleAtFixedRate(task, 0, 3);
	}

}
