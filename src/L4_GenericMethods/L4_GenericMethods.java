package L4_GenericMethods;

public class L4_GenericMethods {
    public static void main(String[] args) {
        Pair<String , Integer> pair = PairFactory.generatePair("One" , 1);
        pair.show();
    }
}

class PairFactory{
    public static <K extends CharSequence , V extends Number> Pair <K, V> generatePair(K Key , V Value){
        return new Pair<>(Key , Value);
    }
    
}

class Pair<K , V>{
    private K Key;
    private V Value;

    Pair(K Key , V Value){
        this.Key = Key;
        this.Value = Value;
    }
    void show(){
        System.out.printf("Key : %s, Value : %s%n" , Key , Value);
    }
}
