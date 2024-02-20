package belloech.org.contentcalender.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record ContentCalenderProperties(String welcomeMsg, String about) {
}
