package blogcast.models;

import sun.security.krb5.internal.ccache.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlogEntry {

    private String title;

    private Object body;

    List<Comment> comments = new ArrayList<>();

    private User author;

    List<Tag> tags = new ArrayList<>();



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
