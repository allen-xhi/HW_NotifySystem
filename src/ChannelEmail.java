public class ChannelEmail extends NotifyChannel{
    public ChannelEmail() {
        this.setPipeline("Email");
    }

    @Override
    public void setPipeline(String pipeline) {
        super.setPipeline(pipeline);
    }

    @Override
    public void Send(String message) {
        System.out.println("【"+ super.Pipeline +"】" + message );
    }
}
