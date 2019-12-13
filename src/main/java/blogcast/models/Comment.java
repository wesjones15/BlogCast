package blogcast.models;


import blogcast.repositories.ReactionRepository;
import blogcast.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENT_ID")
    private Long id;

    @Column(name = "COMMENT_VALUE")
    private String comment;

    @Autowired
    private ReactionRepository reactionRepository;
    @Autowired
    private TagRepository tagRepository;

//    @Autowired
//    public Comment(ReactionRepository rr, TagRepository tr) {
//        this.reactionRepository = rr;
//        this.tagRepository = tr;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
