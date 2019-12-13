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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
