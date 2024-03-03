package belloech.org.contentcalender.config;

import belloech.org.contentcalender.models.Content;

import belloech.org.contentcalender.repositories.ContentRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;


@Component
public class SeedData implements CommandLineRunner {


    @Autowired
    private  ContentRepository contentRepository;



    @Autowired
    private  ObjectMapper objectMapper;



    @Override
    public void run(String... args) throws Exception {

        try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")){

            contentRepository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>(){}));
        }
    }
}

