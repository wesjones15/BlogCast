package blogcast.models;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Timeline {
    private Long id;


   private List<BlogEntry> AllBlogs = new ArrayList<>();


    public Timeline(List<BlogEntry> allBlogs) {
        AllBlogs = allBlogs;
    }


    public BlogEntry getBlog(){
        return null;
    }

    public void addBlog(){

    }

    public List<BlogEntry> getAllBlogs() {
        return AllBlogs;
    }

    public void setAllBlogs(List<BlogEntry> allBlogs) {
        AllBlogs = allBlogs;
    }
}
