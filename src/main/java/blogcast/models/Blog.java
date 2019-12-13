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
    private List<User> authorizedUsers = new ArrayList<>();
    private List<BlogEntry> allPosts = new ArrayList<>();
    private List<User> followers = new ArrayList<>();
    private List<Comment> blogComments = new ArrayList<>();

    //CONSTRUCTORS
    public Blog(String blogName, User creator) {
        this.blogName = blogName;
        this.authorizedUsers.add(creator);
    }

    public Blog(String blogName, List<User> creators) {
        this.blogName = blogName;
        this.authorizedUsers = creators;
    }


    //GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public List<User> getAuthorizedUsers() {
        return authorizedUsers;
    }

    public void setAuthorizedUsers(List<User> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
    }

    public List<BlogEntry> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(List<BlogEntry> allPosts) {
        this.allPosts = allPosts;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<Comment> getBlogComments() {
        return blogComments;
    }

    public void setBlogComments(List<Comment> blogComments) {
        this.blogComments = blogComments;
    }
}

