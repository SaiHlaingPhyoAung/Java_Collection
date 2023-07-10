package L2_TypeParameters;

import java.util.Arrays;

public class Type {
    public static void main(String[] args) {

        //Java 5-6
        Pair<String , Integer> pair1 = new Pair<String , Integer>("one" , 1);

        //Java 7-9  Diamond
        Pair<String ,Integer> pair2 = new Pair<>("two" , 2);

        //Java 10 (Local Variable type interface)
        var pair3 = new Pair<String , Integer>("three" , 3);

        //Bounded Type (Number ko extend lod htr yin Integer/double toh pl ya)
        Bou <Integer > bou = new Bou<>();

    }
}

//Single Type Parameter <String , Integer>
class Container<T>{
    private T[] data;
    Container(T[] list){}
    public void add(T data){}
    public T[] find(int index){
            return Arrays.copyOf(data,data.length);
    }
}

//Multiple Type Parameter <K ,V>
//K is Key / V is Value
class Pair<K,V>{
    private K Key ;
    private V Value;

    Pair(K Key , V Value){}
}

//2Ways

//Define a yin lod
class MyPair extends Pair<String , Integer>{

    MyPair(String Key, Integer Value) {
        super(Key, Value);
    }
}

class MyPair1<K,V> extends Pair<K,V>{
    MyPair1(K Key, V Value) {
        super(Key, Value);
    }
}

//Bounded Type
class Bou<T extends Number>{

}

