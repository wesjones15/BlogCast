package blogcast.services;

import blogcast.repositories.TimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TimelineService {

    private TimelineRepository timelineRepository;
    @Autowired
    public TimelineService(TimelineRepository timelineRepository){
        this.timelineRepository = timelineRepository;
    }

     public Boolean removeBlog(){

        return false;
    }
}
