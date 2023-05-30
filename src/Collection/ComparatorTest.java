package Collection;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Integer> s= Arrays.asList(4,54,5,45,45,4,54,5,4);
        Comparator<Integer> comapare= new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        };
        s.sort(comapare);
        System.out.println(s);



        List<Names> name = Arrays.asList(new Names("abdf",232),new Names("gfg",12121),new Names("acfdfd",343));
        name.sort(new CompareByString());
        System.out.println(name.toString());
    }
}

class  CompareByString implements Comparator<Names>{
    @Override
    public int compare(Names s1, Names s2) {
        return s1.name.compareTo(s2.name);
    }
}
class Names{
    String name;
    int value;
    public Names(String name,int value){
        this.name=name;
        this.value=value;
    }
}
