package FleetOfThings;

import java.util.ArrayList;
import java.util.Collections;

public class Thing implements Comparable<Thing>{
    private String name;
    public boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    public int checkCompleted (Thing o){
        if (this.completed && o.completed){
            return(this.name.compareTo(o.name));
        } else if (!this.completed && !o.completed){
            return (this.name.compareTo(o.name));
        } else {}
        return 0;
    }

    @Override
    public int compareTo(Thing o) {

        if (this.completed == o.completed) {
            if (this.name.compareTo(o.name) > 0) {
                return -1;
            } else if (this.name.compareTo(o.name) < 0) {
                return +1;
            } else {
                return 0;
            }

        } else if (this.completed == !o.completed) {
            if (this.name.compareTo(o.name) > 0) {
                return -1;
            } else if (this.name.compareTo(o.name) < 0) {
                return +1;
            } else {
                return 0;
            }

        } else if (!this.completed == o.completed) {
            if (this.name.compareTo(o.name) > 0) {
                return -1;
            } else if (this.name.compareTo(o.name) < 0) {
                return +1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}