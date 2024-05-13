import java.util.EmptyStackException;

public class QueueUsingTwoStacks {
    private Stack inbox; 
    private Stack outbox;

    
    public QueueUsingTwoStacks(int capacity) {
        inbox = new Stack(capacity);
        outbox = new Stack(capacity);
    }

    
    public void enqueue(int element) {
        inbox.push(element);
    }

   
    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        if (outbox.isEmpty()) {
            throw new EmptyStackException();
        }
        return outbox.pop();
    }

    
    public int peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        if (outbox.isEmpty()) {
            throw new EmptyStackException();
        }
        return outbox.peek();
    }

   
    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
}