package belloech.org.contentcalender.controller;


import belloech.org.contentcalender.models.Content;

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
    private ContentRepository contentRepository;





    //make a request and find all pieces of content in the system

    @GetMapping("")
    public List<Content> findAllContent(){

        return contentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id){

        return contentRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));


    }

    @PostMapping("")
    public void createContent(@Valid @RequestBody Content content){

        contentRepository.save(content);
    }

    @PutMapping("/{id}")
    public void updateContentById(@RequestBody Content content, @PathVariable Integer id){

        Optional<Content> contents = contentRepository.findById(id);
        if (contents.isPresent()){
            Content existingContent = contents.get();
            contentRepository.save(content);
        }
        else {
            throw new IllegalArgumentException("User not found with ID: " + id);
        }
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
        public void deleteContentById(@PathVariable Integer id){
        contentRepository.deleteById(id);
    }


}
