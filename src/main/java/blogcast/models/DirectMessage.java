package blogcast.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DirectMessage {
    @Id
    @GeneratedValue
    @Column(name = "DIRECTMESSAGE_ID")
    private Long id;

    private Long fromUserId;
    private Long toUserId;
    private String title;
    private String message;
    private Long timestamp;
}
