package blogcast.models;

import blogcast.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "User_ID")
    private Long id;

    @OneToMany
    @Column(name = "Followers")
    private List<User> followers = new ArrayList();

    @OneToMany
    @Column(name = "Following")
    private List<User> following = new ArrayList();

    @OneToMany
    @Column(name = "Blog_Entries")
    private List<BlogEntry> userBlogEntries = new ArrayList();

    @OneToMany
    @Column(name = "Direct_Messages")
    private List<DirectMessage> directMessages = new ArrayList();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<BlogEntry> getUserBlogEntrys() {
        return userBlogEntries;
    }

    public void setUserBlogEntrys(List<BlogEntry> userBlogEntrys) {
        this.userBlogEntries = userBlogEntrys;
    }

    public List<DirectMessage> getDirectMessages() {
        return directMessages;
    }

    public void setDirectMessages(List<DirectMessage> directMessages) {
        this.directMessages = directMessages;
    }
}
