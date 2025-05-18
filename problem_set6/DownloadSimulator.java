package problem_set6;

//Create a Runnable that simulates a download task and
//executes it via a Thread. 

public class DownloadSimulator  {
    public static void main(String[] args) {
        String fileURL = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf";
        String savePath = "src/problem_set6/dummy.pdf";
        Thread downloadThread = new Thread(new DownloadTask(fileURL,savePath));
        downloadThread.start();        
    }
    
}
