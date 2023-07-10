package L6_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class L7_Iterator {
    //Is a Design pattern

    /*Why Iterator

    var set = new HashSet<>(Set.of(1,2,3,4,5);
    void removeEven(Connection <Integer> collection){
            for(Integer i : collection){
                if(i % 2 == 0){
                    collection.remove(i);
                }
             }
          }

     looping pat yin Collection hte ka element ko delete / add lod loh ma ya loh
     Iterator ko tone
     */

    //How to Use
    void removeEven(Collection<Integer> collection){
        Iterator<Integer> itr = collection.iterator();

        //hasNext ka Iterate lod mk Element shi ty lr kyi
        //shi yin return true / ma shi yin return false
        while (itr.hasNext()){
            Integer data = itr.next();
            if (data % 2 == 0){
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        //List Iterator ka Index num nk thein
        //List Iterator ko shae ka lal u loh ya naug ka lal u loh ya
        //List Iterator ko List Object mr pl u loh ya
        List <Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        var itr1 = list.listIterator();
        var itr2 = list.listIterator(list.size() -1);

        //next ka naug 1ku ko u
        itr1.next();

        //nextIndex ka naug index num ko u
        itr1.nextIndex();

        //previous num ko u
        itr2.previous();

        //hasNext ka naung mr shi twy lr sit
        itr2.hasNext();

        //add   add lik yin next lod htr tk kg tk naug ka add
        itr1.add(100);

        //set ka element ko change (next lod htr tk kg ko change)
        itr1.set(99);

        //removeIf    Lambda
        list.removeIf(a -> a % 2 ==0);
    }

}
