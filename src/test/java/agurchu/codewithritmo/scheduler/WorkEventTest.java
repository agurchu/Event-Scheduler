package agurchu.codewithritmo.scheduler;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkEventTest {
    @Test
    public void testGetEventName() {
        WorkEvent event = new WorkEvent();
        assertEquals("Work Event", event.getEventName());
    }

    @Test
    public void testSetEventName() {
        WorkEvent event = new WorkEvent();
        event.setEventName("Team Meeting");
        assertEquals("Team Meeting", event.getEventName());
    }

    @Test
    public void testGetEventDate() {
        WorkEvent event = new WorkEvent();
        assertEquals("2025-01-01", event.getEventDate());
    }

    @Test
    public void testSetEventDate() {
        WorkEvent event = new WorkEvent();
        event.setEventDate("2025-06-15");
        assertEquals("2025-06-15", event.getEventDate());
    }

    @Test
    public void testGetDuration() {
        WorkEvent event = new WorkEvent();
        assertEquals(120, event.getDuration());
    }

    @Test
    public void testSetDuration() {
        WorkEvent event = new WorkEvent();
        event.setDuration(90);
        assertEquals(90, event.getDuration());
    }

    @Test
    public void testGetPriority() {
        WorkEvent event = new WorkEvent();
        assertEquals("High", event.getPriority());
    }
}