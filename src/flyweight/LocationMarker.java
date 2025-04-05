package flyweight;

public class LocationMarker {
    private double x, y;
    private MarkerStyle style;

    public LocationMarker(double x, double y, String icon, String color) {
        this.x = x;
        this.y = y;
        this.style = MarkerStyleFactory.getStyle(icon, color);
    }

    public void draw() {
        System.out.println("Drawing marker at (" + x + "," + y + ") with icon [" +
                style.icon + "] and color [" + style.color + "]");
    }
}
