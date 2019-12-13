package blogcast.services;

import blogcast.repositories.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogEntry {

    private BlogEntryRepository blogEntryRepository;

    @Autowired

    public BlogEntry(BlogEntryRepository blogEntryRepository) {
        this.blogEntryRepository = blogEntryRepository;
    }


}
