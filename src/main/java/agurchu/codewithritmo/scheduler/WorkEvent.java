package agurchu.codewithritmo.scheduler;


public class WorkEvent extends Event {
    private String eventName;
    private String eventDate;
    private int duration;
    private final String priority = "High";

    public WorkEvent(String eventName, String eventDate, int duration){
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.duration = duration;
    }

    public WorkEvent() {
        eventName = "Work Event";
        eventDate = "2025-01-01";
        duration = 120;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getEventDate() {
        return eventDate;
    }

    @Override
    public String getEventName() {
        return eventName;
    }

    @Override
    public String getPriority() {
        return priority;
    }
    @Override
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public void setDuration(int duration) {
        if (duration >= 0) {
            this.duration = duration;
        }
    }

    @Override
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}