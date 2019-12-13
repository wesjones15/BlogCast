package blogcast.repositories;

import blogcast.models.Reaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface ReactionRepository extends CrudRepository<Map<Reaction, Integer>, Long> {
}
