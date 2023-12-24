import java.util.HashMap;

public class LanguageEnUs extends LanguageFamily{
    @Override
    public String getContent(Event event) {
        HashMap<String, String> map = new HashMap<>();
        map.put(RegisterSuccessEvent.class.getName(), "register success: %s");
        map.put(BookCourseEvent.class.getName(), "book course: %s");
        map.put(CancelCourseEvent.class.getName(), "cancel course: %s");

        if (map.containsKey(event.getClass().getName())) {
            return map.get(event.getClass().getName());
        }

        return "";
    }
}
