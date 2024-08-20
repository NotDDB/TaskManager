package org.alexvr.Model;
import java.time.*;
public class Task {
    private String name;
    private LocalDate deadline;
    private boolean completed;
    private String description;

    public void setName(String Name){
        this.name = Name;
    }
    public void setDeadline(LocalDate deadline){
        this.deadline = deadline;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCompleted(Boolean completed){
        this.completed = completed;
    }

    public String getName(){
        return this.name;
    }
    public LocalDate getDeadline(){
        return this.deadline;
    }
    public String getDescription(){
        return this.description;
    }
}
