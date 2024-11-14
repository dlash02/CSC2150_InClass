import java.util.PriorityQueue;

class Guest implements Comparable<Guest> {
    String name;
    int priority;

    public Guest(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Define natural order based on priority (lower priority value means higher priority)
    @Override
    public int compareTo(Guest other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}
