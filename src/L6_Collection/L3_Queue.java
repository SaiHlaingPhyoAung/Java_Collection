package L6_Collection;

import java.util.*;
import java.util.function.Consumer;

/*
            Throws Exception        Return Special Value
Insert          add(e)                      offer(e)
Remove          remove()                    poll()
Examine         element()                   peek()
 */

public class L3_Queue {
    public static void main(String[] args) {
        var list = new LinkedList<String>();
        Queue<String> queue = list;
        queue.add("One");      //list hte lal win
        list.add("Two");
        queue.offer("Three");      //offer ka Encapsulation kyg List mr tone loh ma ya /LinkedList mr pl ya

        var value = queue.remove();         //first win tk kg ko remove / first in first out
        var value1 = queue.poll();          //remove and poll are same energy  / .clear() ka a kone clear lod
        //remove ka ma shi tr ko remove lod yin "Exception" pyit
        //poll ka ma shi tr ko remove lod yin "Null" pay

        //element  / peek
        queue.element();      //element ka a hlae kya tk kg ko pya
        queue.peek();
        //element ka ma shi tr ko kaw yin Exception pyit
        //peek ka ma shi tr ko kaw yin "Null" pay
    }

    //Queue Iteration
    public static void internal (Queue<String> queue){
        queue.forEach(new Consumer<>(){
            public void accept(String data){
                System.out.println(data);
            }
        });
    }

    public static void external(Queue<String> queue){
        for (String data : queue){
            System.out.println(data);
        }
    }

    //Queue to Deque
    public static void loop(Queue<String> queue , boolean firstEnd){
        Deque<String> deque = new ArrayDeque<>(queue);
        while(!deque.isEmpty()){
            if (firstEnd){
                System.out.println(deque.pollFirst());
            } else {
                System.out.println(deque.pollLast());
            }
        }
    }

}


