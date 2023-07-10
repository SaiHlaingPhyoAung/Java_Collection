package L6_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class L4_Deque {
    /*
                Throw exception | Special value | Throws exception | Special value
    Insert        add First(e)    offerFirst(e)      addLast(e)        offerLast(e)
    Remove       removeFirst()    pollFirst          removeLast         pollLast()
    Examine        getFirst()     peekFirst()        getLast()         peekLast()
     */

    /*
    Stack Method | Equivalent Deque Method
    push(e)        addFirst(e)
    pop()          removeFirst()
    peek()         getFirst()
     */

    public static void main(String[] args) {
        //linked list nk lal tone loh ya
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("One");
        deque.addFirst("Two");
        //Two One >output
        deque.addLast("java");
        deque.addLast("kotlin");
        //Two One java kotlin >output
        deque.offerFirst("angular");
        deque.offerLast("css");

        System.out.println(check("{()}"));
    }

    //Deque as Stack            {()}
    public static boolean check(String str){
        char [] array = str.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : array){
            //is open
            if (c == '{' || c == '(' || c == '[') {
                //push addFirst
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }

            //pop removeFirst
            char open = stack.pop();

            if ((open == '(' && c !=')' )
                || (open == '{' && c != '}' )
                || (open == '[' && c != ']')){
                return false;
            }
        }
        return stack.isEmpty();
    }

}
