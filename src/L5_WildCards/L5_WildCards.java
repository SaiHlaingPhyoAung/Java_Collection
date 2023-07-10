package L5_WildCards;

public class L5_WildCards {
    public static void main(String[] args) {

        //wild card <?> mr kyite tk hrr a sr hto loh ya
        //Variable declare ma lod chin ty yin Wild Card ko tone
        Container<?> container;
        container = new Container<String>();
        container = new Container<Integer>();

        //Upper Bounded
        //Bird ko extend lod htr loh Bird nk tuh Child class pl myin ya
        Container<? extends Bird> container1;
        container1 = new Container<Bird>();
        container1 = new Container<Egle>();

        //Lower Bounded     Parent class ko kaw loh ya
        Container<? super Bird> container2;
        container2 = new Container<Animal>();
        container2 = new Container<Bird>();
    }
}

class Container<T>{}

class Animal{}

class Bird extends Animal{}

class Egle extends Bird{}
