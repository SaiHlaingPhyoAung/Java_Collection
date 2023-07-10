package L6_Collection;

import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class L2_List {
    public static void main(String[] args) {
        /*
        List ka unlimited Array nk tu
        Element twy ko htk pg loh ya
         */

        //Set ka shi p thr element ko htk pg loh ma ya
        //List ka shi p thr element ko pg loh ya
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("Hello");
        System.out.println(arrayList);

        //Immutable  (of nk build ta mya Immutable)
        List<String> list = new ArrayList<String>();
        list = List.of("Immutable");

        //Immutable to Mutable
        list = new LinkedList<>(list);
        list.add("Mutable");

        //ArrayList      (Index num nk access lod yin kg / memory pr mr space take ma u)
        List<String> al = new ArrayList<>();
        al.add("ArrayList");

        //LinkedList      (Link nk connect htr loh Add/Update/Remove lod chin yin tone tink)
        List<String> ll = new LinkedList<>();
        ll.add("LinkedList");

        //add array with index num
        List data = List.of(1,2,3,4,5,6,7,8,9,10);
        data = new ArrayList<>(data);
        //normal add
        data.add(11);
        //add with index num
        data.add(5,12);
        System.out.println(data);

        //add all
        var insert = List.of(-1,-2,-3);
        data.addAll(3,insert);

        //Indexof
        data.lastIndexOf(-1);      //naug ka search
        data.indexOf(-1);

        //remove
        data.remove(2);

        //subList (Jar hte ka kg ko pya)
        data.subList(0,3);

        //set    (a sar hto)replace
        data.set(1 , 5);



    }


    //Iteration
    public static void ForEach(List<Integer> list){
        for (Integer data : list){
            System.out.println(data);
        }
    }

    //For each
    public static void internalFor(List<Integer> list){
        list.forEach(new Consumer<>(){
            public void accept(Integer data){
                System.out.println(data);
            }
        });
    }

    //Legacy For
    public static void legacyFor(List<Integer> list){
        for (var i = 0 ; i < list.size() ; i ++){
            System.out.println(list.get(i));
        }
    }


}

