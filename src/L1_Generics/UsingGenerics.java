package L1_Generics;

import java.util.Arrays;

public class UsingGenerics {
    public static void main(String[] args) {
        var strContainer= new BeforeContainer<String>();
                                            //kyite tk type declare lod loh ya

        BeforeContainer<String > b = new BeforeContainer<String>();
        //Di lo lal declare lod loh ya
        strContainer.add("Hello Java");

        var hello = strContainer.get(0);

        System.out.println(hello);
        System.out.println(strContainer.size());
        System.out.println(Arrays.toString(strContainer.getAll()));

    }
}

                    // ***
class BeforeContainer <T>{
    @SuppressWarnings("Unchecked")
    private T array[] = (T[])new Object[0];
    void add (T message){
        array = Arrays.copyOf(array , array.length+1);
        array[array.length-1] = message;
    }

    int size(){
        return array.length;
    }

    T get(int index){
        return array[index];
    }

    T[] getAll(){
        return Arrays.copyOf(array , array.length);
    }
}
