package L3_SubTyping;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Dog is an Animal
        // Container of Dog is not A Container Animal
        //Inheritance hierarchy ka Class mr pl pyit Generics mr ma pyit
        //Type Parameter <> mr Inheritance ma pyit
        // Error
        //Container<Animal> c = new Container<Dog>();

        Container<Animal> c = new Container<Animal>();
        SubContainer<Animal> s = new SubContainer<Animal>();
        c = s;

        Container<Animal> ca = new SubContainer<Animal>();
    }
}

class Animal{
}

class Dog extends Animal{
}

class Container <T extends Animal>{
}

class SubContainer <T extends Animal> extends Container<T>{
}

