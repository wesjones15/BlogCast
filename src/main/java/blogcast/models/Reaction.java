package blogcast.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reaction {
    @Id
    @GeneratedValue
    @Column(name = "REACTION_ID")
    private Long id;

    @Column(name = "REACTION_VALUE")
    private String emoji;

    @Column(name = "REACTION_COUNT")
    private Integer count;

}
