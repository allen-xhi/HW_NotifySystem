import java.util.ArrayList;

public class Event {
    public  ArrayList<NotifyChannel> NotifyChannels;
    public  void notify(User user) {
    }
  public void dispatch(User user){
        for(NotifyChannel notifyChannel: NotifyChannels){
            notifyChannel.send(String.format(
                    user.language.getContent(this),
                    user.userName))
            ;
        }
  }
    public  void setNotifyChannels(ArrayList<NotifyChannel> notifyChannels) {
        NotifyChannels = notifyChannels;
    }
}
