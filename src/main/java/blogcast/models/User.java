package blogcast.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "User_ID")
    private Long id;

    @Column(name = "Followers")
    private List<User> followers = new ArrayList<>();

    @Column(name = "Following")
    private List<User> following = new ArrayList<>();

    @Column(name = "Blog_Entries")
    private List<BlogEntry> userBlogEntries = new ArrayList<>();

    @Column(name = "Direct_Messages")
    private List<DirectMessage> directMessages = new ArrayList<>();

    public void commentOnBlogEntry(BlogEntry blogEntry, Comment comment, String words){

        comment.setComment(words);
        blogEntry.comments.add(comment);
    }

    //Method incomplete
    //Need to figure out the "body Object"
    //And tags
    public String postBlogEntry(BlogEntry blogEntry, String title, Object body){

        blogEntry.setTitle(title);
        blogEntry.setBody(body);
        userBlogEntries.add(blogEntry);

        return blogEntry.toString();
    }

    public Boolean follow(User user) throws Exception {

        if (followers.contains(user)) {
            throw new Exception("You already follow this user!wq");
        }
        else {
            followers.add(user);
            followers.contains(user);
            return true;
        }
    }

    public Boolean unFollow(User user){

        if(followers.contains(user)){
            followers.remove(user);
            return true;
        }
        return false;
    }


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
