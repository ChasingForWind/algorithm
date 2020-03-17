package 算法lru实现;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*使用linkedHashmap实现*/
public class demo2 {
    static class MyLinkedHashMap<K,V> extends LinkedHashMap<K,V>{
        private int capacity;
        MyLinkedHashMap(int capacity){
            this.capacity = capacity;
        }
        @Override
        public boolean removeEldestEntry(Map.Entry<K, V> eldest){
            return super.size()>capacity;
        }
    }


    public static void main(String[] args) {
       // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(10,0.75f,true);
        MyLinkedHashMap<Object, Object> map = new MyLinkedHashMap<>(4);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);
        /*map.get(2);
        map.get(1);*/
        Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey());
        }
    }
}
