package blogcast.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Timeline {

    List<BlogEntry> AllBlogs = new ArrayList();

    public BlogEntry getBlog(){
        return null;
    }

    public void addBlog(){

    }

    public Boolean removeBlog(){

        return false;
    }

    public List<BlogEntry> getAllBlogs() {
        return AllBlogs;
    }

    public void setAllBlogs(List<BlogEntry> allBlogs) {
        AllBlogs = allBlogs;
    }
}
