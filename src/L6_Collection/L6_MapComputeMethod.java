package L6_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class L6_MapComputeMethod {
    public static void main(String[] args) {
        var map = new HashMap<String , Integer>();
        map.put("one" , 1);
        map.put("two" , 2);
        map.put("three" , 3);

        //Compute Key pay p Value pyg
        map.compute("one" , new BiFunction<>(){
            public Integer apply(String k , Integer v){
                return v * 3;
            }
        });

        //by Lambda
        map.compute("three" , (k , v) -> v * 3);

        map.computeIfPresent("two" , (k ,v) -> v *2);


        //Normal Compute ka ma shi tr ko twr pay yin "Exception" pyit
        //ComputeIfPresent ka ma shi tr ko pay yin "Null" pay
        //2 ku lone a lod lod pone chin tu

        //ComputeIfAbsent ka ma shi yin bl tan foe hte ma lal so p hte
        map.computeIfAbsent("four" , k -> Integer.parseInt(k) *4);

        //forEach
        map.forEach((k,v) ->System.out.println(v));
    }
}
