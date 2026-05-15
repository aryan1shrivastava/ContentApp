package dev.aryan.contentapp.controller;

import dev.aryan.contentapp.config.ContentAppProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    private final ContentAppProperties props;

    public HomeController(ContentAppProperties props) {
        this.props = props;
    }

    @GetMapping("/")
    public ContentAppProperties home(){
        return props;
    }
}
