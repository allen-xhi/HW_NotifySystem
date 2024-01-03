public class ChannelSms extends NotifyChannel {
    public ChannelSms() {
        this.setPipeline("SMS");
    }
    @Override
    public void send(String message) {
        System.out.println("【"+ super.pipeline +"】" + message );
    }
}
