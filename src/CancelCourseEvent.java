public class CancelCourseEvent extends Event{

    public static void notify(User user) {
        String message;
        if(user.language.getClass() == LanguageZhTw.class) {
            message = "使用者:" + user.userName + "已取消課程";
        }else{
            message = "User:" + user.userName + " canceled the course";
        }
        //System.out.println("result ==" + message );

        int ChannelNum = NotifyChannels.size();
        for (int i= 0;i<ChannelNum;i++ ){
            NotifyChannels.get(i).Send(message);
        }
    }


}
