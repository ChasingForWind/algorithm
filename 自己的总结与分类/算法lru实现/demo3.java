package 算法lru实现;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*手动删除*/
public class demo3 {
    class LRUCache {

        private int capacity;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                //如果存在key的话，先把key的值取出，再删除key，再放入key，以保证位于最前面
                int value = map.get(key);
                map.remove(key);
                map.put(key,value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            //如果map包含key直接删除
            if(map.containsKey(key)){
                map.remove(key);
            }else if(map.size()==capacity){
                //如果map不包含key的情况下，容量满了，就删除最近最少使用的数字
                Iterator<Map.Entry<Integer,Integer>> iterator =  map.entrySet().iterator();
                iterator.next();
                iterator.remove();
                //插入key
            }
            map.put(key,value);
        }
    }
}
