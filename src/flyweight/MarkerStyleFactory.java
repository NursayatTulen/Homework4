package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color) {
        String key = icon + "-" + color;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color));
            System.out.println("Created new style: " + key);
        }
        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}
