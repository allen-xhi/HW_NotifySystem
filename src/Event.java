import java.util.ArrayList;

public class Event {
    public ArrayList<NotifyChannel> notifyChannels;

    public void setNotifyChannels(ArrayList<NotifyChannel> notifyChannels) {
        this.notifyChannels = notifyChannels;
    }

    public void dispatch(User user) {
        for (NotifyChannel notifyChannel : notifyChannels) {
            notifyChannel.send(String.format(
                user.language.getContent(this),
                user.userName
            ));
        }
    }
}
