import java.util.ArrayList;
import java.util.List;

public class Operations {

    List<Event> events= new ArrayList<>();

    public Operations() {
        Event event = new Event();
        event.setBudget(3000);
        events.add(event);
        events.add(event);
        events.add(event);
    }

    public List<Event> getAll(){
        return events;
    }

    public void remove(Long id){
        for (Event e: events) {
            if(e.getId()==id){
                events.remove(e);
                break;
            }
        }

    }
}
