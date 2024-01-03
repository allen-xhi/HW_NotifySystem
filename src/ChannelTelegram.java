public class ChannelTelegram extends NotifyChannel{

    public ChannelTelegram() {
        this.setPipeline("Telegram");
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
