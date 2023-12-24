import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //使用者宣告
        User userAllen = new User(new LanguageZhTw(),"Allen");
        User userBen = new User(new LanguageEnUs(),"Ben");
        //通知管道
        ArrayList<NotifyChannel> notifyChannels = new ArrayList<>();
        notifyChannels.add(new ChannelSms());
        notifyChannels.add(new ChannelEmail());
        //註冊
        BookCourseEvent.setNotifyChannels(notifyChannels);
        BookCourseEvent.notify(userBen);
        //取消
        CancelCourseEvent cancelCourseEvent = new CancelCourseEvent();
        cancelCourseEvent.setNotifyChannels(notifyChannels);
        cancelCourseEvent.dispatch(userAllen);
    }

}