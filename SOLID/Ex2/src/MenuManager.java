import java.util.LinkedHashMap;
import java.util.Map;

public class MenuManager {
   private final Map<String, MenuItem> menu = new LinkedHashMap<>();

     public void add(MenuItem i) { 
        menu.put(i.id, i); 
    }
    public MenuItem get(String id) {
        return menu.get(id);
    }

    public Map<String, MenuItem> getAll() {
        return menu;
    }
}
