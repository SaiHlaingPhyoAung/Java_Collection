package L6_Collection;

import java.util.*;

public class L9 {
    public static void main(String[] args) {
        var set = Set.of(1,8,2,3,4,5,3,9);

        //Compare lod loh ma ya min/max ko tone loh ya
        //Compare Primitive Data/ Wrapper Class /String / Date Time /Calendar
        //Cant Compare Custom Object / data type
        //min num ko pya
        Collections.min(set);

        //max num ko pya
        Collections.max(set);

        var c = Set.of(new Data("A") , new Data("B"));
        System.out.println(Collections.max(c));

        //Using DataReverse
        //Collections.max(set , new DataReverseComparator());
        //output > 1

        //Sort  Collections tai Sort lod loh ma ya List 1myo pl Sort lod loh ya
        var list = new ArrayList<>(set);
        Collections.sort(list);

        //reverse sorting
        //Collections.sort(list , new DataReverseComparator());

        //reverse order
        Collections.sort(list, Collections.reverseOrder());

       // Collections.sort(list, Collections.reverseOrder(new DataReverseComparator()));
        
        //Shuffle  pyit chin 1lo pyit
        Collections.shuffle(list);


        var s = Set.of(new Data("a") , new Data("b") , new Data("c"));
        Collections.min(s);
        Collections.max(s);

        Collections.min(s , new DataReverseComparator());
       }
}

    /*Custom Object ko min / max shr yin
    1. Comparable Interface ko implement lod pay ya
    2. compareTo method ko Override lod pay ya
     */

class Data implements Comparable<Data>{
    private String value;

    Data(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }

    public int compareTo(Data other){
        if (null != other){
            return this.value.compareTo(other.value);
        }
        return 1;
        //data 2ku tu yin 0ko return pyn py ya
        //Owner ka gyi yin 1
        //Owner ka ngl yin -1
    }
}

//A por ka Comparable ko ma kyite yin koh hrr ko Customize lod p tone
class DataReverseComparator implements Comparator<Data>{
    public int compare(Data d1, Data d2){
        if (d1 == null){
            return 1;
        }
        if (d2 == null){
            return -1;
        }
        return d2.compareTo(d1);
    }


}



