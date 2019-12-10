package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    List<User> followers = new ArrayList<>();
    List<User> following = new ArrayList<>();
    List<Blog> userBlogs = new ArrayList<>();

    public String comment(String comment){
        return null;
    }

    public String post(Blog blog, BlogEntry blogEntry ){

        if(blog.isAuthorized(this)){
            //add post
            //else throw exception
        }
        return null;
    }

    public Boolean follow(User user){

        return false;
    }

    public Boolean unFollow(User user){

        return false;
    }

}
