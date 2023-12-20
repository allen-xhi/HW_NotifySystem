import java.util.HashMap;
import java.util.Map;

public class LanguageZhTw extends LanguageFamily{
    @Override
    public String getContent(Event e) {
        Map<String, String> map = new HashMap<>();
        map.put(BookCourseEvent.class.getName(), "使用者:%s已預約課程");
        map.put(CancelCourseEvent.class.getName(), "使用者:%s已取消課程");
        map.put(RegisterSuccessEvent.class.getName(), "使用者:%s已註冊");

        if (map.containsKey(e.getClass().getName())) {
            return map.get(e.getClass().getName());
        }

        return "";
    }
}
