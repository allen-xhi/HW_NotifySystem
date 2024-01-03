import java.util.Map;
import java.util.HashMap;
public class LanguageZhTw extends LanguageFamily{
    @Override
    public String getContent(Event e) {
        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put(BookCourseEvent.class.getName(),"使用者:%s已預約課程");
        hashmap.put(CancelCourseEvent.class.getName(),"使用者:%s已取消課程");
        hashmap.put(RegisterSuccessEvent.class.getName(),"使用者:%s已註冊");
        if(hashmap.containsKey(e.getClass().getName())){
         return    hashmap.get(e.getClass().getName());
        }
        return null;
    }
}
