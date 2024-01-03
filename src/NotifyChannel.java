public abstract class NotifyChannel {
    String pipeline;
    public void setPipeline(String pipeline) {
        pipeline = pipeline;
    }
    public abstract void send(String message);
}
