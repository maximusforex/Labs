import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(8);
//        queue.add(4);
//        queue.add(1);
//        queue.offer(44);
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println("**********");
//        System.out.println(queue.element());
//        System.out.println(queue.element());
//        System.out.println("**********");
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println("**********");
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(44);
//        deque.addFirst(22);
//        System.out.println(deque);
//        System.out.println(deque.getLast());
//        System.out.println(deque.peekLast());
//        System.out.println(deque.peekLast());
//        System.out.println(deque.pollLast());
//        System.out.println(deque.pollLast());
//        System.out.println(deque.pollLast());
//        System.out.println(deque.peekLast());
//        //System.out.println(deque.element());//Exception in thread "main" java.util.NoSuchElementException
//        //System.out.println(deque.getLast());//Exception in thread "main" java.util.NoSuchElementException
//        //System.out.println(deque.getFirst());//Exception in thread "main" java.util.NoSuchElementException

        Stack<Integer> stack = new Stack<>();
        stack.push(55);
        stack.push(3);
        stack.push(31);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());//Exception in thread "main" java.util.EmptyStackException
        //System.out.println(stack.peek());//Exception in thread "main" java.util.EmptyStackException
        System.out.println(stack.empty());
        System.out.println("**********");

        String []test = new String[]{"Maxim","Evgen","Ivan","Olga"};
        addArray(test);
        System.out.println("**********");
        dequeArray(test);
        System.out.println("**********");
        String test1="Maxim";
        stackTest(test1);
        System.out.println(reverse(test1));
        System.out.println("**********");

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        queue.add(4);
        queue.add(2);
        queue.add(7);
        queue.add(5);
        queue.add(0);
        System.out.println(queue);

    }
    private static <T> void addArray(T []array){
        Queue<T> queue = new LinkedList<>();
        for (T anArray : array) {
            queue.add(anArray);
        }
        while(queue.size()!=0){
            System.out.println(queue.poll());
        }
//        for(String element : queue){
//            System.out.println(element);
//        }
    }
    private static <T> void dequeArray(T []array){
        Deque<T> deque = new ArrayDeque<>();
        for(T deqArray:array){
            deque.add(deqArray);
        }
        boolean output = true;
       while(deque.size()!=0) {
           if (output) {
               System.out.println(deque.pollFirst());
               output = false;
           } else {
               System.out.println(deque.pollLast());
               output = true;
           }
       }
    }
    private static void stackTest(String string){
        Stack<String> stack = new Stack<>();
        char []c = string.toCharArray();
        for(int i =0;i<c.length;i++){
            stack.push(String.valueOf(c[i]));
        }
        String res = "";
        for(int i = c.length -1;i>=0;i--){
            res+=stack.pop();
        }
        System.out.println(res);
    }
    private static String reverse(String input){
        String[] inputArray = new String[input.length()];
        for(int i = 0;i<input.length();i++){
            inputArray[i] = String.valueOf(input.charAt(i));
        }
        Stack<String> stack = new Stack<>();
        for(int i = 0; i<inputArray.length;i++){
            stack.push(inputArray[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
