package belloech.org.contentcalender.repositories;

import belloech.org.contentcalender.models.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContentRepository extends ListCrudRepository<Content, Integer> {


}
