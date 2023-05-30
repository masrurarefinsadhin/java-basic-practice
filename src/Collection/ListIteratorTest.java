package Collection;

import java.util.*;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "c");
        ListIterator<String> iterator=names.listIterator(1);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
