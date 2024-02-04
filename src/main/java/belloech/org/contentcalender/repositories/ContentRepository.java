package belloech.org.contentcalender.repositories;

import belloech.org.contentcalender.models.Content;
import belloech.org.contentcalender.models.Status;
import belloech.org.contentcalender.models.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentRepository {

    public List<Content> contents = new ArrayList<>();

    public ContentRepository(){

    }

    public List<Content> findAll(){

        return contents;
    }
    public Optional<Content> findById (Integer id){
        return contents.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content){
        contents.add(content);


    }

    @PostConstruct
    private void init(){
        Content c = new Content(
                1,"My first post",
                "my first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");


contents.add(c);

    }

    public boolean existById(Integer id) {
        return contents.stream().filter(c->c.id().equals(id)).count()==1;
    }

    public void deleteById (Integer id){

        contents.removeIf(c->c.id().equals(c.id()));

    }
}
