package blogcast.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blog {
    //FIELDS
    @Id
    @GeneratedValue
    private Long id;
    private String blogName;
    @OneToMany
    @JoinColumn
    private List<User> authorizedUsers;
    @OneToMany
    @JoinColumn
    private List<BlogEntry> allPosts;
    @OneToMany
    @JoinColumn
    private List<User> followers;
    @OneToMany
    @JoinColumn
    private List<Comment> blogComments;

    //CONSTRUCTORS
    public Blog() {
    }

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

