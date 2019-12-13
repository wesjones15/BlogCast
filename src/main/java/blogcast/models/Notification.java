package blogcast.models;

import javax.persistence.Entity;
import javax.persistence.Id;


//TODO populate Notification
@Entity
public class Notification {
    @Id
    private Long id;
    private String notificationBody;
}
