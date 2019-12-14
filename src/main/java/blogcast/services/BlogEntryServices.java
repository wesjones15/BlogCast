package blogcast.services;

import blogcast.models.BlogEntry;
import blogcast.repositories.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogEntryServices {

    private BlogEntryRepository blogEntryRepository;

    @Autowired
    public BlogEntryServices(BlogEntryRepository blogEntryRepository) {
        this.blogEntryRepository = blogEntryRepository;
    }

   public Iterable<BlogEntry> index() {
        return  blogEntryRepository.findAll();
   }

    public BlogEntry show(Long id) {
        return blogEntryRepository.findById(id).get();
    }

    public BlogEntry create (BlogEntry blogEntry) {
        return blogEntryRepository.save(blogEntry);
    }

    public BlogEntry save (BlogEntry blogEntry) {
        return blogEntryRepository.save(blogEntry);
    }

    public BlogEntry update(Long id, BlogEntry updateBlogEntry) {
        BlogEntry originalBlog = blogEntryRepository.findById(id).get();
        originalBlog.setTitle(updateBlogEntry.getTitle());
        originalBlog.setBody(updateBlogEntry.getBody());
        return blogEntryRepository.save(originalBlog);
    }

    public Boolean delete(Long id) {
        blogEntryRepository.deleteById(id);
        return true;
    }

}
