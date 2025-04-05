package proxy;

public class RealImage {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading full image from disk: " + filename);
    }

    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + filename);
    }
}
