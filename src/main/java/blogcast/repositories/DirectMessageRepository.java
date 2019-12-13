package blogcast.repositories;

import blogcast.models.DirectMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectMessageRepository extends CrudRepository<DirectMessage, Long> {
}
