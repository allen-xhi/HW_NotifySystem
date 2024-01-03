public class ChannelSms extends NotifyChannel{

    public ChannelSms() {
        this.setPipeline("SMS");
    }

    @Override
    public void setPipeline(String pipeline) {
        super.setPipeline(pipeline);
    }

    @Override
    public void send(String message) {
        System.out.println("【"+ super.Pipeline +"】" + message );
    }
}
