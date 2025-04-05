package proxy;

public class ImageUploaderProxy {
    private Agent agent;

    public ImageUploaderProxy(Agent agent) {
        this.agent = agent;
    }

    public void uploadImage(String filename) {
        if (agent.canUpload()) {
            System.out.println("Image uploaded successfully: " + filename);
        } else {
            System.out.println("Access denied. Please log in to upload images.");
        }
    }
}
