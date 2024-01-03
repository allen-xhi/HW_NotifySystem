public abstract class NotifyChannel {
    String Pipeline;

    public void setPipeline(String pipeline) {
        Pipeline = pipeline;
    }

    public abstract void send(String message);
}
