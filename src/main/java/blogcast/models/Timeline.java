package blogcast.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Timeline {

    List<BlogEntry> allBlogPost = new ArrayList<>();

    public void addToTimeline(BlogEntry blogEntry){
        allBlogPost.add(blogEntry);
    }

    public List<BlogEntry> refresh(){
        //if add then refresh
        return allBlogPost;
    }

}
