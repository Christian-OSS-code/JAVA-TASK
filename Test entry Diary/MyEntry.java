package src.Entry;

import java.time.LocalDateTime;

public class MyEntry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public MyEntry(int id, String title, String body, LocalDateTime dateCreated) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = dateCreated;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
    @Override
    public String toString() {
        return " Entry id: " + id + " Title: " + title + " Body: " + body + " DateCreated: " + dateCreated;
    }
}

