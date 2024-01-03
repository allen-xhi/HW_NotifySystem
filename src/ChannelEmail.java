public class ChannelEmail extends NotifyChannel {
    public ChannelEmail() {
        this.setPipeline("Email");
    }
    @Override
    public void send(String message) {
        System.out.println("【"+ super.pipeline +"】" + message );
    }
}
