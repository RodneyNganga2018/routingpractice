package io.codingdojo.routingpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DojoController {
    public static void main(String[] args) {
        SpringApplication.run(DojoController.class, args);
    }

    @RequestMapping("/{dojo}")
    public String dojo(@PathVariable("dojo") String location) {
        switch(location) {
            case("dojo"):
                return "The dojo is awesome!";
            case("burbank dojo"):
                return "Burbank Dojo is location in Southern California.";
            case("san jose"):
                return "SJ dojo is the headquarters.";
            default:
                return "Error!!";
        }
    }
}
