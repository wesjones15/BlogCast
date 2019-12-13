package blogcast.models;


import blogcast.repositories.ReactionRepository;
import blogcast.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comment {

    private String comment;
    private ReactionRepository reactionRepository;
    private TagRepository tagRepository;

    @Autowired
    public Comment(ReactionRepository rr, TagRepository tr) {
        this.reactionRepository = rr;
        this.tagRepository = tr;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
