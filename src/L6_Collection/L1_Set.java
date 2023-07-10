package L6_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class L1_Set {
    public static void main(String[] args) {
        //Duplicate ka shi p tr element ko htk hte loh ma ya;
        //of ka Immutable Object
        Set set = Set.of("Hello");
        //set.add("java");   UnsupportedOperationException
        System.out.println(set);

        //CopyOf   java 9
        HashSet mutableSet = new HashSet<String>();
        mutableSet.add("Hello");
        mutableSet.add("Java");

        //mutable to immutable
        Set immutable = Set.copyOf(mutableSet);
        System.out.println(immutable);

        //---------------------------------

        Set<String> s1 = new HashSet<>();           //Hash set
        Set<String> s2 = new TreeSet<>();           //Tree set
        Set<String> s3 = new LinkedHashSet<>();     //Linked Hash set

        //Hash set(Memory size a nae sone nk Data ko thein)
        s1.add("5");       //***Sort lod poh arr ma ma kan
        s1.add("3");
        s1.add("7");
        System.out.println(s1);

        //Tree set     ***Sort lod htr tk element ko lo chin yin Tree set ko tone
        s2.add("5");   //***Sort lod loh ya tk Object pyit poh lo***
        s2.add("3");
        s2.add("7");
        System.out.println(s2);

        //Linked set      **bl tu a yin hte tr lal ti chin yin tone
        s1.add("5");     //memory mr ny yr po u loh
        s1.add("3");     //***ma lo yin ma tone tink
        s1.add("7");
        System.out.println(s1);

        //--------------------------------------------

        //addAll
        Set se1 = new HashSet();
        se1.add("Java");
        se1.add("Kotlin");
        se1.addAll(immutable);

        se1.remove("Java");
        se1.removeAll(immutable);

        Set p = new HashSet();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);

        //predicate
        Predicate predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer data){
                return data % 2 != 0;
            }
        };
        //removeIF
        p.removeIf(predicate);

        //contain
        p.contains(3);

        //empty
        p.isEmpty();

        //remove / all
        p.remove(p);

        //toArray
        var array = p.toArray();
        var array1 = p.toArray(new Integer[p.size()]);

        //Lambda
        set = new HashSet<>(set);
        //forEach
        set.forEach(arg -> System.out.println(arg));

        //removeIf
        //set.removeIf(arg -> (arg % 2 ==0));
        //--------------------------------------------------
    }

        //Iteration
    static void forLoop(Set<Integer> set){
        for (var element : set){
            System.out.println(element);
        }
    }

    static void forEachInternal(Set<Integer> set){
        set.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer data) {
                System.out.println(data);
            }
        });
    }

}
