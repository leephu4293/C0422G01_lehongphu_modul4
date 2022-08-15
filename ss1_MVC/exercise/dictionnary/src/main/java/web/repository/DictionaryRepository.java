package web.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
     private static  Map<String,String> map = new HashMap<>();
    static {
        map.put("apple","qua tao");
        map.put("banana","qua chuoi");
        map.put("lemon","qua chanh");
        map.put("cucumber","Trai dua leo");
        map.put("mango","qua xoai");
        map.put("cherry","trai Cherry");
    }

    @Override
    public String findWord(String word) {
        String str=null ;
        for (Map.Entry<String,String> entry : map.entrySet()) {
            if (word.equals(entry.getKey())){
                str = entry.getValue();
            }
        }
        return str;
    }
}
