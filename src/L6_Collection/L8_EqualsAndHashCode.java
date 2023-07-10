package L6_Collection;

public class L8_EqualsAndHashCode {

    /*Object o1 = new Object("Hello");
      Object o2 = new Object("Hello");

      s1.equals(s2); > result false     object ko sit yin false hwt
      ak lo ma pyit chin loh Equals ko Override lod
     */

    private String value;

    public L8_EqualsAndHashCode(String value){
        if ( value == null){
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public String toString(){
        return value;
    }

    public String getValue(){
        return value;
    }

    //Equals ko Override lod yin HashCode ko lal ma pyit ma ny override lod pay ya ml

    //override equals
    public boolean equals(Object obj){
            if (null != obj){
                L8_EqualsAndHashCode d = (L8_EqualsAndHashCode) obj;
                return this.value.equals(d.value);
            }
            return false;
    }

    //override HashCode
    public int HashCode(){
        return value.hashCode();
    }
}
