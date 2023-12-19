public class BookCourseEvent extends Event  {
    public static void notify(User user) {
        String message;
        if(user.language.getClass() == LanguageZhTw.class) {
            message = "使用者:" + user.userName + "已預約課程";
        }else{
            message = "User:" + user.userName + " book the course";
        }
        //System.out.println("result ==" + message );

        int ChannelNum = NotifyChannels.size();
        for (int i= 0;i<ChannelNum;i++ ){
            NotifyChannels.get(i).Send(message);
        }
    }


}
