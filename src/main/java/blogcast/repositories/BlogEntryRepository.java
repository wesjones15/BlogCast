package blogcast.repositories;

import blogcast.models.BlogEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogEntryRepository extends CrudRepository <BlogEntry, Long> {
}
