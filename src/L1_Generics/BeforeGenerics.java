package L1_Generics;

import java.util.Arrays;
import java.util.Date;

/*
   What is Generics
   A Programming concept
   Same Function _ Different Data

   Generics ko Class / Interface / Method twy mr yay loh ya

   How to write
   <T>  <E>
   T is type parameter

   **Primitive Data Type ko Generics mr tone loh ma ya
    */

public class BeforeGenerics {
    public static void main(String[] args) {
        var strContainer= new BefContainer();

        strContainer.add("Hello Java");
        strContainer.add(new Date());
        strContainer.add(strContainer);
        strContainer.add(1000);

        var hello = strContainer.get(0);

        var date = (Date)strContainer.get(0);

        System.out.println(hello);
        System.out.println(strContainer.size());
        System.out.println(Arrays.toString(strContainer.getAll()));
    }
}


class BefContainer {
    private Object array[] = {};
    void add (Object message){
        array = Arrays.copyOf(array , array.length+1);
        array[array.length-1] = message;
    }

    int size(){
        return array.length;
    }

    Object get(int index){
        return array[index];
    }

    Object[] getAll(){
        return Arrays.copyOf(array , array.length);
    }
}