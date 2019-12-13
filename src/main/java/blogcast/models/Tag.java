package blogcast.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    @Column(name = "TAG_ID")
    private Long id;

    @Column(name = "TAG_VALUE")
    private String tag;


}
