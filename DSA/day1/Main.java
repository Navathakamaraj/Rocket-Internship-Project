// Implementation stack using queue
import java.util.LinkedList;
import java.util.Queue;

class Stack {
    Queue<Integer> que = new LinkedList<>();

   
    void push(int x) {
        que.add(x);

        int size = que.size();

        for (int i = 0; i < size - 1; i++) {
            que.add(que.remove());
        }
    }

    
    int pop() {
        if (que.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return que.remove();
    }

    
    int peek() {
        if (que.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return que.peek();
    }

  
    boolean isEmpty() {
        return que.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());

        System.out.println(s.pop()); 
        System.out.println(s.pop());  
        System.out.println(s.pop());  

        System.out.println(s.isEmpty()); 
    }
}