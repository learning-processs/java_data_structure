package HashMapfolder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Hashmaps {
    public static void main(String[] args) {
        // String name = "Anu";
        // int code = name.hashCode();
        // System.out.println(code);

        HashMap<String, Integer > map = new HashMap();
        map.put("Anu", 21);
        map.put("Anshu", 22);
        map.put("Anshuman", 22);

        System.out.println(map.get("Anu"));
        System.out.println(map.getOrDefault("Nia",24));


        HashSet set = new HashSet<>();  // No duplicates...

        set.add(56);
        set.add(56);
        set.add(46);
        System.out.println(set);


         TreeMap<String, Integer > tree = new TreeMap<>();  // Sorted Order.
        
        tree.put("Anu", 21);
        tree.put("Anshu", 22);
        tree.put("Anshuman", 22);

        System.out.println(tree.get("Anu"));
    }
}
