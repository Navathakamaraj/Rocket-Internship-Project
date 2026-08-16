//Implementation Queue using Stack
import java.util.Stack;

 class Queue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

  
    void add(int x) {
        s1.push(x);
    }


    int remove() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }


        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }


    int peek() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class Main1 {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.peek());   

        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
    }
}