package proxy;

public class ImageProxy {
    private String filename;
    private RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void displayThumbnail() {
        System.out.println("Showing thumbnail: " + filename);
    }

    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}
