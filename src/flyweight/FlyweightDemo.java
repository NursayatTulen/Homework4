package flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        System.out.println("=== Flyweight Pattern Demo ===");

        List<LocationMarker> markers = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            markers.add(new LocationMarker(i, i + 0.5, "hospital", "red"));
        }

        for (int i = 0; i < 5000; i++) {
            markers.add(new LocationMarker(i, i + 0.5, "restaurant", "blue"));
        }

        System.out.println("Total markers created: " + markers.size());
        System.out.println("Unique style objects used: " + MarkerStyleFactory.getTotalStyles());
    }
}
