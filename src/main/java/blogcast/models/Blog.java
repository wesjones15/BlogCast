package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    //FIELDS
    private Long id;
    private String blogName;
    private List<User> authorizedUsers;
    private List<BlogEntry> blogs = new ArrayList<>();
    private List<User> followers = new ArrayList<>();

    //CONSTRUCTORS


    //GETTERS AND SETTERS


    //OTHER METHODS

}

//    FUTURE STUFF TO ADD:
//    private List<Comment> blogComments = new ArrayList<>();