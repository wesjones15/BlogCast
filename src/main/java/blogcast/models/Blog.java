package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogEntry> blogs = new ArrayList<>();
//    private List<Comment> blogComments = new ArrayList<>();
    public List<BlogEntry> getBlogs() {
        return blogs;
    }

//    public Boolean isAuthorized(User user){
//        return authorizedUsers.contains(user);
//    }

    public void setBlogs(List<BlogEntry> blogs) {
        this.blogs = blogs;
    }
}
//all comments key, vlaues are a list of key