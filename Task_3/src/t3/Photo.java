package t3;

import java.util.List;

public class Photo {
    private String title;
    private String author;
    private String location;
    private List<String> tags;

    public Photo(String title, String author, String location, List<String> tags) {
        this.title = title;
        this.author = author;
        this.location = location;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
