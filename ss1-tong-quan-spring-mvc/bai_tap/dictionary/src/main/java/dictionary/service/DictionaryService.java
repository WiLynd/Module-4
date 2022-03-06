package dictionary.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService{

    public Map<String, String> dictionary() {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Xin chào");
        map.put("Goodbye", "Tạm biệt");
        map.put("Book", "Quyển sách");
        map.put("Computer", "Máy tính");
        map.put("Dictionary", "Từ điển");
        return map;
    }

    @Override
    public String translate(String input) {
        Map<String,String> word = dictionary();
        for (Map.Entry<String, String> entry : word.entrySet()) {
            if(entry.getKey().equals(input)){
                return entry.getValue();
            }
        }
        return "Word not found";
    }
}
