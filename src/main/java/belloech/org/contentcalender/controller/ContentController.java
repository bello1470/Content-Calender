package belloech.org.contentcalender.controller;


import belloech.org.contentcalender.models.Content;
import belloech.org.contentcalender.repositories.ContentCollectionRepository;
import belloech.org.contentcalender.repositories.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {


    @Autowired
    private ContentCollectionRepository contentCollectionRepository;





    //make a request and find all pieces of content in the system

    @GetMapping("")
    public List<Content> findAllContent(){

        return contentCollectionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id){

        return contentCollectionRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
    }

    @PostMapping("")
    public void createContent(@Valid @RequestBody Content content){

        contentCollectionRepository.save(content);
    }

    @PutMapping("/{id}")
    public void updateContentById(@RequestBody Content content, @PathVariable Integer id){
        if (!contentCollectionRepository.existById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }
        contentCollectionRepository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
        public void deleteContentById(@PathVariable Integer id){
        contentCollectionRepository.deleteById(id);
    }


}
