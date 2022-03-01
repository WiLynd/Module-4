package dictionary.repository;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository {
    public Map<String, String> dictionary() {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Xin chào");
        map.put("Goodbye", "Tạm biệt");
        map.put("Book", "Quyển sách");
        map.put("Computer", "Máy tính");
        map.put("Dictionary", "Từ điển");
        return map;
    }
}
