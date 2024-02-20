package belloech.org.contentcalender.controller;


import belloech.org.contentcalender.config.ContentCalenderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private ContentCalenderProperties properties;

    @GetMapping("/")
    public ContentCalenderProperties Home(){

        return properties;
    }
}
