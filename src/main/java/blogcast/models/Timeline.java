package blogcast.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Timeline {

    @Id
    @GeneratedValue
    private Long id;
    private ArrayList<BlogEntry> AllBlogs;// = new ArrayList();

    public Timeline() {}
    public Timeline(List<BlogEntry> allBlogs) {
        AllBlogs = allBlogs;
    }

    public List<BlogEntry> getAllBlogs() {
        return AllBlogs;
    }

    public void setAllBlogs(List<BlogEntry> allBlogs) {
        AllBlogs = allBlogs;
    }
}
