package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogEntry> blogs = new ArrayList<>();

    public List<BlogEntry> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<BlogEntry> blogs) {
        this.blogs = blogs;
    }
}
