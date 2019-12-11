package blogcast.models;

import sun.security.krb5.internal.ccache.Tag;

import java.util.ArrayList;
import java.util.List;

public class Comment {

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    List<Tag> tags = new ArrayList<>();
}
