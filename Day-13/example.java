import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //  INITIALIZATION
        Queue<String> printQueue = new LinkedList<>();

        // ENQUEUE: Adding elements to the back of the queue
        printQueue.add("Annual_Report.pdf");
        printQueue.add("Invoice_#502.png");
        printQueue.add("Meeting_Notes.docx");

        System.out.println("Current Print Queue: " + printQueue);
        // PEEK: View the front element without removing it
        String nextUp = printQueue.peek(); 
        System.out.println("\nNext document to print: " + nextUp);
        // 4. DEQUEUE (poll): Retrieve and remove the front element (FIFO)
        while (!printQueue.isEmpty()) {
            String document = printQueue.poll(); 
            System.out.println("Printing: " + document);
            System.out.println("Remaining in queue: " + printQueue);
        }
        --
        // 5. HANDLING EMPTY QUEUES
        String emptyCheck = printQueue.poll();
        System.out.println("\nAttempting to poll empty queue: " + emptyCheck);
    }
}
