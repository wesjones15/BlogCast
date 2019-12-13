package blogcast.repositories;

import blogcast.models.Timeline;
import org.springframework.data.repository.CrudRepository;

public interface TimelineRepository extends CrudRepository<Timeline, Long> {

}
