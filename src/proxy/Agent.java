package proxy;

public class Agent {
    private boolean isLoggedIn;

    public Agent(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public boolean canUpload() {
        return isLoggedIn;
    }
}
