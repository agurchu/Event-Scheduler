package agurchu.codewithritmo.scheduler;


public class SocialEvent extends Event {
    private String eventName;
    private String eventDate;
    private int duration;
    private final String priority = "Medium";

    public SocialEvent(String eventName, String eventDate, int duration){
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.duration = duration;
    }

    public SocialEvent() {
        eventName = "Social Event";
        eventDate = "2025-01-01";
        duration = 90;
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