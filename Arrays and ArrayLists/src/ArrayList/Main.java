package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(20);
        System.out.println(arrayList);

        arrayList.add(1, 99);
        System.out.println(arrayList);

        arrayList.remove(3);
        System.out.println(arrayList);

        arrayList.clear();
        System.out.print(arrayList);
    }
}
