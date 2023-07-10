package L6_Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L5_Map {
    public static void main(String[] args) {
        //Map ka Collection yk Sub Interface ma hok
        //But Container a ny nk tone loh ya
        //Hash , TreeMap , LinkedMap tot nk object build loh ya
         Map<Integer, String> map = new HashMap<>();
         //put ka data hte
        map.put(1 , "Value");

        //key nk value ko u
        var key = map.keySet();
        var value = map.values();

        //map = 1,one ; 4,four ; 2,two
        //copyOf so Sort lod pay
        map = Map.copyOf(map);
        //of nk so Immutable pyit ak tr kyg Put lod loh ma ya
        map = Map.of(1,"one" , 2,"two");

        //Immutable to Mutable
        map = new HashMap<>(map);

        //Immutable ka Mutable so Object build p change loh ya
        //Mutable ka Immutable so CopyOf nk change loh ya

        //entrySet ka object ko pyn pay
        map.entrySet();

        //Remove 2ku shi
        //Remove ka Key ko pay ya**
        map.remove(1);
        //Key Kaw Value kaw correct mha remove lod
        map.remove(1 , "one");

        //put nk putIfAbsent ka ma tu
        //put ka Key shi p tr ko value hte yin override lod p hte pay
        // 1 , "one"  /put 1 , "two"    /output 1 , "two"
        //putIfAbsent ka ma shi mha hte pay
        // 1 , "one"  /putIfAbsent 1, "two"   /output 1 ,one
        map.putIfAbsent(2 , "two");

        //replace 2ku shi   shi mha replace
        map.replace(1 ,"OnePointOne");
        map.replace(1,"One" , "onepoint");

    }

    //HashMap , TreeMap ka kyi sin nge lik pyit
    //LinkedHashMap so output a tai hwt
    public void setData(Map<Integer , String> map){
        for (Integer i = 10 ; i > 0 ; i--){
            map.put(i , i.toString());
        }
    }
}
