package blogcast.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blog {
    //FIELDS
    @Id
    @GeneratedValue
    private Long id;
    private String blogName;
    private List<User> authorizedUsers;
    private List<BlogEntry> blogs = new ArrayList<>();
    private List<User> followers = new ArrayList<>();

    //CONSTRUCTORS


    //GETTERS, SETTERS, AND SIMILAR METHODS
    public Long getId(){ return this.id; }
    public String getBlogName(){ return this.blogName; }
    public void  setBlogName(String newName){ this.blogName = newName; }


    //OTHER METHODS

}

//    FUTURE STUFF TO ADD:
//    private List<Comment> blogComments = new ArrayList<>();