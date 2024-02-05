package belloech.org.contentcalender.models;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Content(

        @NotBlank
    Integer id,
    String title,
    String desc,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
){

}
