package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    List<User> followers = new ArrayList<>();
    List<User> following = new ArrayList<>();
    List<Blog> userBlogs = new ArrayList<>();

    public String comment(){
        return null;
    }

    public String post(){

        return null;
    }

    public Boolean follow(){

        return false;
    }

    public Boolean unFollow(){

        return false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public List<Blog> getUserBlogs() {
        return userBlogs;
    }

    public void setUserBlogs(List<Blog> userBlogs) {
        this.userBlogs = userBlogs;
    }
}
