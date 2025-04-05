package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===");

        ImageProxy proxy = new ImageProxy("house.jpg");
        proxy.displayThumbnail();
        proxy.displayFullImage();


        Agent agent1 = new Agent(true);
        Agent agent2 = new Agent(false);

        ImageUploaderProxy uploader1 = new ImageUploaderProxy(agent1);
        ImageUploaderProxy uploader2 = new ImageUploaderProxy(agent2);

        uploader1.uploadImage("villa.jpg");
        uploader2.uploadImage("apartment.jpg");
    }
}
