public class RegisterSuccessEvent extends Event{
    public static void notify(User user) {
        String message;
        if(user.language.getClass() == LanguageZhTw.class) {
            message = "使用者:" + user.userName + "已註冊";
        }else{
            message = "User:" + user.userName + " regist success";
        }
        //System.out.println("result ==" + message );

        int ChannelNum = NotifyChannels.size();
        for (int i= 0;i<ChannelNum;i++ ){
            NotifyChannels.get(i).Send(message);
        }
    }


}
