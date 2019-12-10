package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogEntry> blogs = new ArrayList<>();

<<<<<<< HEAD
    public List<BlogEntry> getBlogs() {
        return blogs;
=======
    private List<Comment> blogComments = new ArrayList<>();

    public Boolean isAuthorized(User user){
        return authorizedUsers.contains(user);
>>>>>>> origin
    }

    public void setBlogs(List<BlogEntry> blogs) {
        this.blogs = blogs;
    }
}
//all comments key, vlaues are a list of key