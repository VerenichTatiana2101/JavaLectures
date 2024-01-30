// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

public class lecture4 {
    // public static void main(String[] args) {
    // Queue<Integer> queue = new LinkedList<Integer>();
    // queue.add(1);
    // queue.add(2);
    // queue.add(3);
    // queue.add(4);
    // System.out.println(queue); // [1, 2, 3, 4]
    // int item = queue.remove();
    // System.out.println(queue); // [2, 3, 4]
    // queue.offer(2809);
    // item = queue.remove();
    // System.out.println(queue); // [3, 4, 2809]
    // item = queue.remove();
    // System.out.println(queue); // [4, 2809]
    // item = queue.poll();
    // System.out.println(queue); // [2809]

    // }

    // Deque
    // public static void main(String[] args) {
    // Deque<Integer> deque = new ArrayDeque<>();
    // deque.addFirst(1);
    // deque.addLast(2);
    // deque.removeLast();
    // deque.removeLast();
    // deque.offerFirst(1);
    // deque.offerLast(2);
    // deque.pollFirst();
    // deque.pollLast();
    // deque.getFirst();
    // deque.getLast();
    // deque.peekFirst();
    // deque.peekLast();
    // }

    // //Stack
    // public static void main(String[] args) {
    // Stack<Integer> stack = new Stack<>();
    // stack.push(1);
    // stack.push(12);
    // stack.push(123);
    // System.out.println(stack.pop()); // 123
    // System.out.println(stack.pop()); // 12
    // }

    // Вычислить значение выражения в постфиксной форме записи
    //найти ошибку
    // public static void main(String[] args) {
    //     var exp = "123*+".split(" "); // 1+2*3
    //     int res = 0;
    //     Stack<Integer> st = new Stack<>();
    //     for (int i = 0; i < exp.length; i++) {
    //         if (isDigit(exp[i])) {
    //             st.push(Integer.parseInt((exp[i])));
    //         } else {
    //             switch (exp[i]) {
    //                 case "+":
    //                     res = st.pop() + st.pop();
    //                     st.push(res);
    //                     break;

    //                 case "-":
    //                     res = -st.pop() + st.pop();
    //                     st.push(res);
    //                     break;

    //                 case "*":
    //                     res = st.pop() * st.pop();
    //                     st.push(res);
    //                     break;

    //                 case "/":
    //                     res = st.pop() / st.pop();
    //                     st.push(res);
    //                     break;

    //                 default:
    //                     break;
    //             }
    //         }
    //     }
    //     System.out.printf("%d\n", st.pop());
    // }



}
