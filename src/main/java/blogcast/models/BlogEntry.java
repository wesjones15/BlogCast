package blogcast.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
public class BlogEntry {


    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Object body;
    @OneToMany
    private List<Comment> comments;

    private User author;
    @OneToMany
    private List<Tag> tags;
    public BlogEntry(){}
    public BlogEntry(Object body ) {
    }

    public BlogEntry( String blogEntryName, Object body) {

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
