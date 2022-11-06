import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet(); // No duplicates, No insertion order
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
//        System.out.println(set);

        TreeSet<Integer> sortedSet = new TreeSet();// No duplications, sorted in ascending order
        sortedSet.add(20);
        sortedSet.add(10);
        sortedSet.add(30);
        sortedSet.add(30);

        System.out.println(sortedSet);
    }
}
