package belloech.org.contentcalender;

import belloech.org.contentcalender.config.ContentCalenderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalenderProperties.class)
public class ContentCalenderApplication {

	public static void main(String[] args) {
		 SpringApplication.run(ContentCalenderApplication.class, args);
		




	}

}
