package JOffer.J09_用两个栈实现队列;

import java.util.LinkedList;

public class Solution {
    class CQueue {
        LinkedList<Integer> stack1;
        LinkedList<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) return -1;
                while (!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            } else return stack2.pop();
        }
    }
}
