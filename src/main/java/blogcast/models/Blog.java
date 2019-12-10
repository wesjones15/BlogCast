package blogcast.models;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private List<User> authorizedUsers = new ArrayList<>();

    private List<Comment> blogComments = new ArrayList<>();

    public Boolean isAuthorized(User user){
        return authorizedUsers.contains(user);
    }

    public void addAuthorizedUser(User user){

    }


}
//all comments key, vlaues are a list of key