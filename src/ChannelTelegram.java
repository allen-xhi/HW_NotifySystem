public class ChannelTelegram extends NotifyChannel {
    public ChannelTelegram() {
        this.setPipeline("Telegram");
    }
    @Override
    public void send(String message) {
        System.out.println("【"+ super.pipeline +"】" + message );
    }
}
