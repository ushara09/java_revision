import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        /*
        *  cannot duplicate keys
        *  can duplicate values
        * */
        HashMap<Integer, String> map = new HashMap();

        map.put(1,"thimal");
        map.put(2,"ushara");
        map.put(3,"geekiyanage");

        // printing the keys
        for(int i : map.keySet()){
            System.out.println(i);
        }

        //print values
        for(String i : map.values()){
            System.out.println(i);
        }

        //print key and values
        for(int key: map.keySet()){
            System.out.println("Key - "+key+" and value - "+map.get(key));
        }
        
    }
}
