package HashMapfolder;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapLL<K, V> {


    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float fl = 0.5f;

    public HashMapLL(){
        list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            list.add(new LinkedList<>());
        }
    }

    public void put(K key , V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        if((float)(size)/ list.size() > fl){
            reHash();
        }
        entities.add(new Entity(key, value));

        size ++;
    }

    private void reHash(){

        System.out.println("We are now rehashing!!");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size = 0;
        for(int i = 0 ; i < old.size() * 2 ; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entities : old){
            for(Entity entry : entities){
                put(entry.key, entry.value);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }


    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        
        Entity target = null;

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }

    @Override
    public String toString(){
        StringBuilder build = new StringBuilder();
        build.append("{");

        for(LinkedList<Entity> entities : list){
            for(Entity entity : entities){
                build.append(entity.key);
                build.append(" = ");
                build.append(entity.value);
                build.append(" , ");
            }
        }

        build.append("}");
        return build.toString();

    }


    class Entity {
        K key;
        V value;

    public Entity(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public static void main(String[] args) {

    HashMapLL<String, String> map = new HashMapLL<>();

    map.put("Mango", "King of fruits");
    map.put("Litchi", "Anu's favorite fruit");
    map.put("Apple", "Red fruit");

    System.out.println("Map: " + map);

    System.out.println("Get Mango: " + map.get("Mango"));
    System.out.println("Get Apple: " + map.get("Apple"));

    System.out.println("Contains Litchi: " + map.containsKey("Litchi"));
    System.out.println("Contains Banana: " + map.containsKey("Banana"));

    map.remove("Apple");

    System.out.println("After removing Apple:");
    System.out.println(map);

    // Trigger rehashing
    for (int i = 1; i <= 20; i++) {
        map.put("Key" + i, "Value" + i);
    }

    System.out.println("After adding more elements:");
    System.out.println(map);
}

}


