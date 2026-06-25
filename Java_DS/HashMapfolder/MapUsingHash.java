package HashMapfolder;

import java.util.*;

class Entity {
    String key;
    String value;


    Entity(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class MapUsingHash {

    private Entity[] entities;


    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity( key , value);

    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null &&
            entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
       if (entities[hash] != null &&
            entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }
    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();
        map.put("Mango", "King of fruits");
        map.put("litchi", "Anu's Fav fruit...");
        System.out.println(map.get("litchi"));
    }
}
