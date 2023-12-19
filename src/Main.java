import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
        User userAllen = new User(new LanguageZhTw(),"Allen");
        User userBen = new User(new LanguageEnUs(),"Ben");
        ArrayList<NotifyChannel> notifyChannels = new ArrayList<>();
        notifyChannels.add(new ChannelSms());
        notifyChannels.add(new ChannelEmail());
        //註冊
//        BookCourseEvent.setNotifyChannels(notifyChannels);
//        BookCourseEvent.notify(userAllen);
        //取消
        CancelCourseEvent.setNotifyChannels(notifyChannels);
        CancelCourseEvent.notify(userAllen);


    }

}