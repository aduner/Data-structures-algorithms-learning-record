package JOffer.J30_包含min函数的栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Aduner
 */
public class MinStack {
    Deque<Integer> A, B;
    public MinStack() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }
    public void push(int x) {
        A.push(x);
        if(B.isEmpty() || B.peek() >= x)
            B.push(x);
    }
    public void pop() {
        if(A.poll().equals(B.peek()))
            B.poll();
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}

