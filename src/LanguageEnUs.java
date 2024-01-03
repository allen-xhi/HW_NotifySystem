import java.util.Map;
import java.util.HashMap;
public class LanguageEnUs extends LanguageFamily {
    @Override
    public String getContent(Event e) {
        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put(BookCourseEvent.class.getName(),"Book course : %s");
        hashmap.put(CancelCourseEvent.class.getName(),"Cancel course : %s");
        hashmap.put(RegisterSuccessEvent.class.getName(),"Register  : %s");
        if(hashmap.containsKey(e.getClass().getName())){
            return    hashmap.get(e.getClass().getName());
        }
        return null;
    }
}
