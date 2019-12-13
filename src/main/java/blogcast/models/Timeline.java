package blogcast.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Timeline {

    @Id
    @GeneratedValue

    private Long id;
    @OneToMany
    private List<BlogEntry> AllBlogs = new ArrayList<>();

    public Timeline() {
    }

    public Timeline(List<BlogEntry> allBlogs) {
        AllBlogs = (ArrayList<BlogEntry>) allBlogs;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BlogEntry> getAllBlogs() {
        return AllBlogs;
    }

    public void setAllBlogs(List<BlogEntry> allBlogs) {
        AllBlogs = (ArrayList<BlogEntry>) allBlogs;
    }
}
