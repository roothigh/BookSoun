package cl.roothigh.booksoun.models;

import com.orm.SugarRecord;

/**
 * Created by SebastianVP on 14-11-2016.
 */

public class Pending extends SugarRecord {

    private String name, description, type;
    private boolean done;

    public Pending(){
    }

    public Pending(String name, String description, boolean done) {
        this.name = name;
        this.description = description;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
